package org.generalprogramming.fabulous;

/**
 * Factory for lazy-loading Fabulous SPI instances.
 */
public class Fabulous {
	private static FabulousServices fabulousServices;

	/**
	 * Get hold of the Fabulous services instance.
	 * @return {@link FabulousServices} with services loaded
	 */
	public static FabulousServices getFabulous() {
		if (fabulousServices == null) {
			fabulousServices = new FabulousServices();
		}

		return fabulousServices;
	}
}
