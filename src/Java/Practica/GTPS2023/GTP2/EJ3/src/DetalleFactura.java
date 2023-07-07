public class DetalleFactura {
    private Integer cantidad;
    private Float monto;
    private Vehiculo vehiculo;

    public DetalleFactura(Integer cantidad, Vehiculo vehiculo) {
        this.cantidad = cantidad;
        this.vehiculo = vehiculo;
        this.actualizarMonto();
    }

    private void actualizarMonto() {
        this.monto = cantidad * vehiculo.getPrecioReal();
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
        this.actualizarMonto();
    }

    public Float getMonto() {
        return monto;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        this.actualizarMonto();
    }

}
