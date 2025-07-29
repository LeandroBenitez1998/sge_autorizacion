package ar.com.redlink.sge.services;

import ar.com.redlink.sge.entitys.Terminal;

public class autorizacionRepository {


    public TerminalDataResponse getTerminal(Long terminalSamId) throws NegocioException {
    	Map<String, Object> params = new HashMap<>();
        params.put("terminalId", terminalSamId);
        params.put("tipoTerminalSamId", AutenticacionConstants.TIPO_TERMINAL_SAM_PAGAR_FLEX);
        params.put("productoId", AutenticacionConstants.PRODUCTO_PAGAR);
        params.put("codServidor", AutenticacionConstants.COD_SERVIDOR_PAGAR_FLEX);

        return Terminal.find( "from Terminal terminal"
                + " left join terminal.enrolamientoSam enrolamientoSam "
                + " left join terminal.dispositivoPos dispositivoPos"
        		+ " where terminal.terminalId = :terminalId"
        		+ " and terminal.tipoTerminalSamId = :tipoTerminalSamId "
        		+ " and terminal.productoId = :productoId "
        		+ " and terminal.servidor.codServidor = :codServidor"
        		+ " and enrolamientoSam.estadoRegistroId = 0"
        		+ " and dispositivoPos.estadoRegistroId = 0", params)
                .project(TerminalDataResponse.class)
                .firstResultOptional()
                .orElseThrow(()->new NegocioException("Terminal inconsistente"));
               
    }


}
