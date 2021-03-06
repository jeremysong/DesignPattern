package ServiceLocator;

/**
 * Service locator is a single point of contact to get services by JNDI lookup, caching the service.
 */
public class ServiceLocator {

    private static Cache cache = new Cache();

    public static Service getService(String jndiName) {
        Service service = cache.getService(jndiName);

        if (service != null) {
            return service;
        }

        InitialContext context = new InitialContext();
        Service service1 = (Service)context.lookUp(jndiName);
        cache.addService(service1);
        return service1;
    }
}
