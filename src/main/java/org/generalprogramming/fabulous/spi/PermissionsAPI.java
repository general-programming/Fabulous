package org.generalprogramming.fabulous.spi;

import java.util.List;
import java.util.UUID;

public interface PermissionsAPI {
	boolean hasPermission(UUID uuid, String node);
	boolean hasAnyPermission(UUID uuid, List<String> node);
}
