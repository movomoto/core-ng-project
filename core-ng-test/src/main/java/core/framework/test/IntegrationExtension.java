package core.framework.test;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestInstancePostProcessor;

/**
 * @author neo
 */
public final class IntegrationExtension implements TestInstancePostProcessor {
    @Override
    public void postProcessTestInstance(Object testInstance, ExtensionContext context) throws Exception {
        TestManager manager = TestManager.get();
        manager.init(context.getRequiredTestClass());
        manager.injectTest(testInstance);
    }
}