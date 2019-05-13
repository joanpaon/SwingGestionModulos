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

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public final class Modelo {

    // Valores por defecto
    public static final String DEF_ID = "0";
    public static final String DEF_ACRONIMO = "n/d";
    public static final String DEF_NOMBRE = "n/d";
    public static final String DEF_CODIGO = "n/d";
    public static final int DEF_HORAS = 0;
    public static final int DEF_CURSO = 0;

    // Expresiones Regulares - Controles Subjetivos
    public static final String ER_ID = "([1-9][0-9]{0,10})";                // Id
    public static final String ER_ACRONIMO = "[A-Z]{1,10}";                 // Acrónimo
    public static final String ER_NOMBRE = "[a-zA-ZáéíóúüñÁÉÍÓÚÜÑ ]{1,50}"; // Nombre
    public static final String ER_CODIGO = "[A-Z0-9]{1,10}";                // Código

    // Propiedades
    private String id;
    private String acronimo;
    private String nombre;
    private String codigo;
    private int horas;
    private boolean curso1;
    private boolean curso2;

    // Soporte Cambio Propiedad
    private final transient PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    // Constructor Predeterminado
    public Modelo() {
        inicializarValoresModelo();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        java.lang.String oldId = this.id;
        this.id = id;
        pcs.firePropertyChange("id", oldId, id);
    }

    public String getAcronimo() {
        return acronimo;
    }

    public void setAcronimo(String acronimo) {
        java.lang.String oldAcronimo = this.acronimo;
        this.acronimo = acronimo;
        pcs.firePropertyChange("acronimo", oldAcronimo, acronimo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        java.lang.String oldNombre = this.nombre;
        this.nombre = nombre;
        pcs.firePropertyChange("nombre", oldNombre, nombre);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        java.lang.String oldCodigo = this.codigo;
        this.codigo = codigo;
        pcs.firePropertyChange("codigo", oldCodigo, codigo);
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        int oldHoras = this.horas;
        this.horas = horas;
        pcs.firePropertyChange("horas", oldHoras, horas);
    }

    public boolean isCurso1() {
        return curso1;
    }

    public void setCurso1(boolean curso1) {
        boolean oldCurso1 = this.curso1;
        this.curso1 = curso1;
        pcs.firePropertyChange("curso1", oldCurso1, curso1);
    }

    public boolean isCurso2() {
        return curso2;
    }

    public void setCurso2(boolean curso2) {
        boolean oldCurso2 = this.curso2;
        this.curso2 = curso2;
        pcs.firePropertyChange("curso2", oldCurso2, curso2);
    }

    // Soporte Cambio Propiedad
    public final void addPropertyChangeListener(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }

    // Soporte Cambio Propiedad
    public final void removePropertyChangeListener(PropertyChangeListener listener) {
        pcs.removePropertyChangeListener(listener);
    }

    // Valores por Defecto > Modelo
    public final void inicializarValoresModelo() {
        setId(DEF_ID);
        setAcronimo(DEF_ACRONIMO);
        setNombre(DEF_NOMBRE);
        setCodigo(DEF_CODIGO);
        setHoras(DEF_HORAS);
        setCurso1(DEF_CURSO == 1);
        setCurso2(DEF_CURSO == 2);
    }

    // ResultSet > Modelo
    public final void actualizarValoresModelo(ResultSet rs) throws SQLException {
        setId(rs.getInt(1) + "");
        setAcronimo(rs.getString(2));
        setNombre(rs.getString(3));
        setCodigo(rs.getString(4));
        setHoras(rs.getInt(5));
        setCurso1(rs.getInt(6) == 1);
        setCurso2(rs.getInt(6) == 2);
    }

    // Modelo > ResultSet
    public final void actualizarValoresRegistro(ResultSet rs) throws SQLException {
        rs.updateInt(1, Integer.parseInt(id));
        rs.updateString(2, acronimo);
        rs.updateString(3, nombre);
        rs.updateString(4, codigo);
        rs.updateInt(5, horas);
        rs.updateInt(6, curso2 ? 2 : curso1 ? 1 : 0);
    }
}
