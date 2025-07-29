package ar.com.redlink.sge.services;

import java.util.HashMap;
import java.util.Map;

import ar.com.redlink.sge.constants.AutenticacionConstants;
import ar.com.redlink.sge.entitys.Terminal;
import ar.com.redlink.sge.responses.DatosTerminalResponse;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AutorizacionService {

    public String getAutorizacion() {
        return "Esto es una prueba";
    }

    public DatosTerminalResponse getDataTerminal(Long terminalSamId) throws Exception {
    	
        DatosTerminalResponse response = new DatosTerminalResponse();
        response.setTerminaid(terminalSamId);
        
        
        
        return response;
        
        
       // Map<String, Object> params = new HashMap<>();
       // params.put("terminalId", terminalSamId);
       // params.put("tipoTerminalSamId", AutenticacionConstants.TIPO_TERMINAL_SAM_PAGAR_FLEX);
      //  params.put("productoId", AutenticacionConstants.PRODUCTO_PAGAR);
      //  params.put("codServidor", AutenticacionConstants.COD_SERVIDOR_PAGAR_FLEX);

      //  return Terminal.find( "from Terminal terminal"
      //  		+ " where terminal.terminalId = :terminalId"
      //  		+ " and terminal.tipoTerminalSamId = :tipoTerminalSamId "
      //  		+ " and terminal.productoId = :productoId "
      // 		+ " and terminal.servidor.codServidor = :codServidor"
      //  		+ " and terminal.estadoRegistroId = 0" , params)
      //          .project(DatosTerminalResponse.class)
      //          .firstResultOptional()
      //         .orElseThrow(()->new Exception("Terminal inconsistente"));
               
    }

    private DatosTerminalResponse DatosTerminalResponse() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'DatosTerminalResponse'");
    }


}
