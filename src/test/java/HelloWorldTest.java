import com.schauzov.HelloWorld;
import jakarta.inject.Inject;
import org.jboss.weld.junit5.EnableWeld;
import org.jboss.weld.junit5.WeldInitiator;
import org.jboss.weld.junit5.WeldSetup;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


@EnableWeld
class HelloWorldTest {

    @Inject
    HelloWorld helloWorld;

    @WeldSetup
    WeldInitiator weld = WeldInitiator.of(HelloWorld.class);

    @Test
    void sayHelloTest() {
        Assertions.assertNotNull(helloWorld);
        helloWorld.sayHello("XXX");
    }
}
