package ar.com.redlink.sge.entitys;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Entidad que representa una Entidad
 */
@Entity
@Table(name = "ENTIDAD")
@Data
@EqualsAndHashCode(callSuper=false)
public class Entidad extends PanacheEntityBase{
    
    /**
     * Identificador de Entidad.
     */
    @Id
    @Column(name="ENTIDAD_ID")
    private Long entidadId;
    /**
     * Identificador del Estado de la Entidad.
     */
    @Column(name="ESTADO_REGISTRO_ID")
    private Long estadoRegistroId;
    /**
     * Codigo de la Entidad.
     */
    @Column(name="COD_ENTIDAD")
    private String codEntidad;
    /**
     * Descripcion de la Entidad.
     */
    @Column(name="DESCRIPCION")
    private String descripcion;
    /**
     * Codigo de la Entidad para B24.
     */
    @Column(name="COD_ENTIDAD_B24")
    private String codEntidadB24;
}
