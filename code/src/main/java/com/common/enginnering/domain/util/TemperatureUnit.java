package com.common.enginnering.domain.util;

/**
 * La enumeraci�n que contiene las unidades de temperaturas.
 * 
 * <ul>
 * <li>{@link TemperatureUnit#CELSIUS}</li>
 * <li>{@link TemperatureUnit#KELVIN}</li>
 * <li>{@link TemperatureUnit#FARENHEIT}</li>
 * <li>{@link TemperatureUnit#RANKINE}</li>
 * <li>{@link TemperatureUnit#REAUMUR}</li>
 * </ul>
 * 
 * @author Guillermo Mazzali
 * @version 1.0
 */
public enum TemperatureUnit {

	CELSIUS("�C"), KELVIN("�K"), FARENHEIT("�F"), RANKINE("�Ra"), REAUMUR("�Re");
	
	/**
	 * La unidad de medida.
	 */
	private String unit;

	/**
	 * El constructor que recibe los datos de una unidad de temperatura.
	 * 
	 * @param unit
	 *            La unidad de medida.
	 */
	private TemperatureUnit(String unit) {
		this.unit = unit;
	}

	@Override
	public String toString() {
		return this.getUnit();
	}

	/**
	 * Retorna la cadena que contiene la unidad de medida.
	 * 
	 * @return La unidad de medida.
	 */
	public String getUnit() {
		return unit;
	}
}