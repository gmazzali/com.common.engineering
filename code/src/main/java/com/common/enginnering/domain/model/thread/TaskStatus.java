package com.common.enginnering.domain.model.thread;


/**
 * La enumeraci�n que contiene los posibles estados de un proceso. Esta enumeraci�n se va a usar internamente dentro del proceso para controlar la
 * ejecuci�n del mismo.
 * 
 * @see GenericTask
 * @see GenericRepetitiveTask
 * @see GenericTaskPool
 * 
 * @since 11/02/2014
 * @author Guillermo Mazzali
 * @version 1.0
 */
public enum TaskStatus {
	/**
	 * El estado que indica que un proceso se inici� con �xito.
	 */
	INIT,
	/**
	 * El estado que indica que un proceso se encuentra en ejecuci�n.
	 */
	RUNNING,
	/**
	 * | El estado que indica que un proceso fue pausado de su ejecuci�n.
	 */
	PAUSE,
	/**
	 * El estado que indica que un proceso fue detenido de manera imprevista.
	 */
	STOP,
	/**
	 * El estado que indica que un proceso finaliz� con �xito.
	 */
	FINISH;
}