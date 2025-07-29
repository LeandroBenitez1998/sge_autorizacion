package ar.com.redlink.sge.responses;

import io.quarkus.hibernate.orm.panache.common.ProjectedFieldName;
import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@RegisterForReflection
@EqualsAndHashCode(callSuper=false)
public class TerminalDataResponse{
	private Long terminalId;
	private Long entidadId;
	private String codTerminal;
	private String terminalB24;
	private String tipoTerminalB24;
	private String identificadorTerminal;
	private String identificadorDispositivo;
	
	public TerminalDataResponse(
            @ProjectedFieldName("terminal.terminalId") Long terminalId,
            @ProjectedFieldName("terminal.entidad.entidadId") Long entidadId ,
            @ProjectedFieldName("terminal.codTerminal") String codTerminal,
            @ProjectedFieldName("terminal.terminalB24") String terminalB24,
            @ProjectedFieldName("terminal.tipoTerminalB24") String tipoTerminalB24,
            @ProjectedFieldName("enrolamientoSam.identificadorTerminal") String identificadorTerminal,
            @ProjectedFieldName("terminal.dispositivoPos.identificadorDisp") String identificadorDispositivo) {
        super();
        this.terminalId = terminalId;
        this.entidadId = entidadId;
        this.codTerminal = codTerminal;
        this.terminalB24 = terminalB24;
        this.tipoTerminalB24 = tipoTerminalB24;
        this.identificadorTerminal = identificadorTerminal; 
        this.identificadorDispositivo = identificadorDispositivo;
    }
}
