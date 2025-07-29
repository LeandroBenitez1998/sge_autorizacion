package ar.com.redlink.sge.constants;

public final class AutenticacionConstants {
    
    /**
     * Atributo perfilSamId del token
     */
    public static final String PERFIL_SAM_ID = "perfilSamId";
    /**
     * Atributo terminalId del Token
     */
    public static final String TERMINAL_ID = "terminalId";
    /** 
     * Atributo entidadId del Token
     */
    public static final String ENTIDAD_ID = "entidadId";
    /**
     * Atributo redId del Token
     */
    public static final String RED_ID = "redId";
    /**
     * Atributo agenteId del Token
     */
    public static final String AGENTE_ID = "agenteId";
    /**
     * Atributo sucursalId del Token
     */
    public static final String SUCURSAL_ID = "sucursalId";
    
    /** 
     * Tipo de Terminal que va a identificar a las Terminales de Pagar Flex
     */
    public static final int TIPO_TERMINAL_SAM_PAGAR_FLEX = 2;
    /** 
     * PRODUCTO_ID asociado a terminales de Pagar Flex
     */
    public static final int PRODUCTO_PAGAR = 4;
    // TODO ver si va este tipo de servidor
    /**
     * Cód. de Servidor asociado a terminales de Pagar Flex
     */
    public static final String COD_SERVIDOR_PAGAR_FLEX = "0009";
    
    public static final String TOKEN = "token";
    public static final String USUARIO = "usuario";
    public static final String NOMBRE = "nombre";
    public static final String APELLIDO = "apellido";
    public static final String COD_TERMINAL = "codTerminal";
    public static final String COD_ENTIDAD = "codEntidad";
    public static final String COD_SUCURSAL = "codSucursal";
    public static final String NOMBRE_SUCURSAL = "nombre_sucursal";
    public static final String COD_ENTIDAD_B24 = "codEntidadB24";
    
    private AutenticacionConstants() {}
}
