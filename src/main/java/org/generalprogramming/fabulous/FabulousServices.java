package org.generalprogramming.fabulous;

import org.generalprogramming.fabulous.spi.PermissionsAPI;

import java.util.ServiceLoader;

public class FabulousServices {
	private final ServiceLoader<PermissionsAPI> permissionsLoader = ServiceLoader.load(PermissionsAPI.class);

	public PermissionsAPI getPermissionsAPI() {
		return permissionsLoader.iterator().next();
	}
}
