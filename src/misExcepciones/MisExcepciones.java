package misExcepciones;

public class MisExcepciones extends Exception{

    private int codigo;

    public MisExcepciones(int codigo) {
        this.codigo = codigo;
    }
    
    @Override
    public String getMessage() {
        String mensaje = "";
        
        switch(codigo){
            case 1:
                mensaje = "ERROR 1: Campo Ingrediente Vacío";
                break;
            case 2:
                mensaje = "ERROR 2: Campo Presentación Vacío";
                break;
            case 3:
                mensaje = "ERROR 3: Campo Marca Vacío";
                break;
            case 4:
                mensaje = "ERROR 4: Campo Fecha Vencimiento Vacío";
                break;
            case 5:
                mensaje = "ERROR 5: Campo Existencia Vacío";
                break;
            case 6:
                mensaje = "ERROR 6: Debe seleccionar una unidad";
                break;
            case 7:
                mensaje = "ERROR 7: Debe seleccionar un proveedor";
                break;
            case 8:
                mensaje = "ERROR 8: Campo Proveedor Vacío";
                break;
            case 9:
                mensaje = "ERROR 9: Campo Nombre Vacío";
                break;
            case 10:
                mensaje = "ERROR 10: Campo Apellido Paterno Vacío";
                break;
            case 11:
                mensaje = "ERROR 11: Campo Apellido Materno Vacío";
                break;
            case 12:
                mensaje = "ERROR 12: Campo Telefono Vacío";
                break;
            case 13:
                mensaje = "ERROR 13: Error en correo";
                break;
            case 14:
                mensaje = "ERROR 14: Campo de ID de cliente Vacio";
                break;
            case 15:
                mensaje = "ERROR 15: Campo de Fecha Vacio";
                break;
            case 16:
                mensaje = "ERROR 16: Campo de Nombre de cliente vacio";
                break;
            case 17:
                mensaje = "ERROR 17: Campo de Apellido Paterno de cliente vacio";
                break;
            case 18:
                mensaje = "ERROR 18: Campo de Apellido Materno de cliente vacio";
                break;
            case 19:
                mensaje = "ERROR 19: Campo de Telefono de cliente vacio";
                break;
            case 20:
                mensaje = "CAMPOS VACIOS, Por favor complete toda la información";
                break;
            case 21:
                mensaje= "Sin cantidad especificada";
                break;
            case 22:
                mensaje = "La lista se encuentra vacía";
                break;
        }
        return mensaje;
    }
    
}
