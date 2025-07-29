package ar.com.redlink.sge.detalle;

import org.jspecify.annotations.NonNull;

import ar.com.redlink.sge.utils.AllArgsConstructor;
import ar.com.redlink.sge.utils.Data;
import ar.com.redlink.sge.utils.RequiredArgsConstructor;


@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class AutorizacionDetalle {

    private long autorizacionId;
    @NonNull
    private String solicitante;//combo
    @NonNull
    private SucursalDetalle sucursal;//buscar
    @NonNull
    private TerminalDetalle terminal;//buscar
    @NonNull
    private ProductoDetalle producto;//valor fijo (4)
    @NonNull
    private RedDetalle red;//buscar
    @NonNull
    private AgenteDetalle agente;//buscar
    @NonNull
    private TipoAutorizacionDetalle tipoAutorizacion;//buscar
    @NonNull
    private String claveTerminal;//buscar
    @NonNull
    private String fechaNegocio;//combo
    @NonNull
    private String montoAplicado;//combo
    @NonNull
    private String montoExtendido;//combo
    @NonNull
    private String numeroAutorizacion;//combo
    
    
}