package org.keycloak.authz.policy.provider.scope;

import org.keycloak.authz.core.model.Policy;
import org.keycloak.authz.core.policy.spi.PolicyProvider;
import org.keycloak.authz.core.policy.spi.PolicyProviderFactory;
import org.keycloak.authz.core.store.PolicyStore;
import org.kohsuke.MetaInfServices;

/**
 * @author <a href="mailto:psilva@redhat.com">Pedro Igor</a>
 */
@MetaInfServices(PolicyProviderFactory.class)
public class ScopePolicyProviderFactory implements PolicyProviderFactory {

    @Override
    public String getName() {
        return "Scope-Based";
    }

    @Override
    public String getGroup() {
        return "Permission";
    }

    @Override
    public String getType() {
        return "scope";
    }

    @Override
    public void init(PolicyStore policyStore) {
    }

    @Override
    public PolicyProvider create(Policy policy) {
        return new ScopePolicyProvider(policy);
    }

    @Override
    public void dispose() {
    }
}
