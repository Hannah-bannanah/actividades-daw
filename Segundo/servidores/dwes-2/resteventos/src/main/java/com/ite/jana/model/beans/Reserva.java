package com.ite.jana.model.beans;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;


/**
 * The persistent class for the reservas database table.
 * 
 */
@Entity
@Table(name="reservas")
@NamedQuery(name="Reserva.findAll", query="SELECT r FROM Reserva r")
public class Reserva implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_RESERVA")
	private int idReserva;

	private int cantidad;

	private String observaciones;

	@Column(name="PRECIO_VENTA")
	private BigDecimal precioVenta;

	//uni-directional many-to-one association to Evento
	@ManyToOne
	@JoinColumn(name="ID_EVENTO")
	private Evento evento;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="ID_USUARIO")
	private Usuario usuario;

	public Reserva() {
	}

	public int getIdReserva() {
		return this.idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public BigDecimal getPrecioVenta() {
		return this.precioVenta;
	}

	public void setPrecioVenta(BigDecimal precioVenta) {
		this.precioVenta = precioVenta;
	}

	public Evento getEvento() {
		return this.evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idReserva);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Reserva))
			return false;
		Reserva other = (Reserva) obj;
		return idReserva == other.idReserva;
	}

	@Override
	public String toString() {
		return "Reserva [idReserva=" + idReserva + ", cantidad=" + cantidad + ", observaciones=" + observaciones
				+ ", precioVenta=" + precioVenta + ", evento=" + evento + ", usuario=" + usuario + "]";
	}

}