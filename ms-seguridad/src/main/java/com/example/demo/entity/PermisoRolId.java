package com.example.demo.entity;

import java.io.Serializable;
import java.util.Objects;

public class PermisoRolId implements Serializable {
    private Integer rolId;
    private Integer moduloId;

    public PermisoRolId() {}

    public Integer getRolId() { return rolId; }
    public void setRolId(Integer rolId) { this.rolId = rolId; }
    public Integer getModuloId() { return moduloId; }
    public void setModuloId(Integer moduloId) { this.moduloId = moduloId; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PermisoRolId that = (PermisoRolId) o;
        return Objects.equals(rolId, that.rolId) && Objects.equals(moduloId, that.moduloId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rolId, moduloId);
    }
}