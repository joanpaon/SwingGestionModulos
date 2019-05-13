/* 
 * Copyright 2019 José A. Pacheco Ondoño - joanpaon@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.entities;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import org.japo.java.libraries.UtilesBD;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public final class DataAccessManager {

    // Propiedades
    private final Properties prp;

    // Artefactos JDBC
    private Connection conn;
    private Statement stmt;
    private ResultSet rs;

    // Modelo
    private Modelo modelo;

    // Constructor Propiedades Conexión
    public DataAccessManager(Properties prp) {
        this.prp = prp;
    }

    // Propiedades Conexión > Connection + Statement + ResultSet
    public final ResultSet conectarBD(Modelo modelo) throws SQLException {
        // Referencia Modelo
        this.modelo = modelo;

        // Connection Properties > Connection
        conn = UtilesBD.conectar(prp);

        // ---- CAMBIOS DE DATOS ----
        // ResultSet.TYPE_FORWARD_ONLY (*) - Indica que el objeto ResultSet se 
        //      puede recorrer unicamente hacia adelante.
        // ResultSet.TYPE_SCROLL_INSENSITIVE - Indica que el objeto ResultSet se 
        //      puede recorrer, pero en general no es sensible a los cambios en 
        //      los datos que subyacen en él.
        // ResultSet.TYPE_SCROLL_SENSITIVE - Indica que el objeto ResultSet se 
        //      puede  recorrer, y además, los cambios en él repercuten
        //      en la base de datos subyacente.
        // ---- MODOS DE CONCURRENCIA ----
        // ResultSet.CONCUR_READ_ONLY (*) - Indica que en el modo de concurrencia 
        //      para el objeto ResultSet éste no puede ser actualizado.
        // ResultSet.CONCUR_UPDATABLE - Indica que en el modo de concurrencia 
        //      para el objeto ResultSet éste podria ser actualizado.
        //
        // Connection + ORGANIZATION + READ MODE > Statement
        stmt = conn.createStatement(
                ResultSet.TYPE_SCROLL_SENSITIVE,
                ResultSet.CONCUR_UPDATABLE);

        // Statement + SQL > ResultSet
        rs = stmt.executeQuery(prp.getProperty("sql01"));

        // ResultSet > Modelo
        importarModelo(rs, modelo);

        // ResultSet
        return rs;
    }

    // Modelo > Nuevo Registro en ResultSet
    public final void insertarRegistro(ResultSet rs) throws SQLException {
        // Registro actual > Registro de Inserción
        rs.moveToInsertRow();

        // Modelo > ResultSet
        modelo.actualizarValoresRegistro(rs);

        // Confirma Inserción
        rs.insertRow();

        // Registro de Inserción > Registro actual
        rs.moveToCurrentRow();
    }

    // Modelo > Registro Actual ResultSet
    public final void actualizarRegistro(ResultSet rs) throws SQLException {
        // Modelo > ResultSet
        modelo.actualizarValoresRegistro(rs);

        // Confirma Actualización
        rs.updateRow();
    }

    // Cierre > ResultSet + Statement + Connection
    public final void desconectarBD() {
        UtilesBD.cerrar(rs);
        UtilesBD.cerrar(stmt);
        UtilesBD.cerrar(conn);
    }

    // Borrar Registro Actual ResultSet
    public final void borrarRegistro(ResultSet rs) throws Exception {
        // Borra Registro Actual
        rs.deleteRow();

        // Primer Registro
        rs.first();
    }

    // ResultSet > Modelo
    public final void importarModelo(ResultSet rs, Modelo modelo) throws SQLException {
        // Número de Registros
        int totalRegistros = UtilesBD.obtenerNumeroRegistros(rs);

        // Inicializa Modelo
        if (totalRegistros > 0) {
            // Registro Actual > Modelo
            modelo.actualizarValoresModelo(rs);
        } else {
            // Valores por Defecto > Modelo
            modelo.inicializarValoresModelo();
        }
    }
}
