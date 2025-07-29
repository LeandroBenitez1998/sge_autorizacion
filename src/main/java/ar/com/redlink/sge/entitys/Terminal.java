package ar.com.redlink.sge.entitys;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Entidad que representa la Terminal de Pagar
 */
@Entity
@Table(name = "TERMINAL_SAM")
@Data
@EqualsAndHashCode(callSuper=false)
public class Terminal extends PanacheEntityBase {

    /**
     * Identificador de la Terminal
     */
    @Id
    @Column(name="TERMINAL_SAM_ID")
    private Long terminalId;
    /**
     * Codigo de la Terminal
     */
    @Column(name="COD_TERMINAL")
    private String codTerminal;
    /**
     * Terminal en Base24
     */
    @Column(name = "TERMINAL_B24")
    private String terminalB24;
    /**
     * Tipo de Terminal en Base24
     */
    @Column(name = "TIPO_TERMINAL_B24")
    private String tipoTerminalB24;
    /**
     * Identificador del Tipo de Terminal
     */
    @Column(name = "TIPO_TERMINAL_SAM_ID")
    private Integer tipoTerminalSamId;
    /**
     * Fecha de activacion de la Terminal.
     */
    @Column(name = "FECHA_ACTIVACION")
    private Timestamp fechaActivacion;
    /**
     * Identificador del Producto asociado a la Terminal.
     */
    @Column(name = "PRODUCTO_ID")
    private Integer productoId;
    /**
     * Servidor asociado a la Terminal.
     */
   // @OneToOne
   // @JoinColumn(name = "SERVIDOR_ID")
    private Integer servidor;
    /**
     * Identificador del Estado de la Terminal.
     */
    @Column(name="ESTADO_REGISTRO_ID")
    private Long estadoRegistroId;
    /**
     * Identificador de la Entidad a la cual pertenece la Terminal.
     */
    @OneToOne
    @JoinColumn(name = "ENTIDAD_ID")
    private Entidad entidad;
    
    
}
