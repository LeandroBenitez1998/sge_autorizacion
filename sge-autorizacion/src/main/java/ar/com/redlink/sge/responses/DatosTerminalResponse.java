package ar.com.redlink.sge.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DatosTerminalResponse {
    
    private Long terminaid;
    private Long productoId;
    private Long redId;
    private Long sucursalId;

}



