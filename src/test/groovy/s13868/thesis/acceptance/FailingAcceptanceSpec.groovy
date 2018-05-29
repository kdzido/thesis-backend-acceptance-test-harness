package s13868.thesis.acceptance

import spock.lang.Specification
import spock.lang.Stepwise

/**
 * @author krzysztof.dzido@gmail.com
 */
@Stepwise
class FailingAcceptanceSpec extends Specification {

    def """Scenario: failing acceptance tests stop delivery pipeline"""() {
        expect:
        throw new RuntimeException("AT failed");
    }
}
