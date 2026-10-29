package dev.owel.message_system

import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest(classes = MessageSystemApplication)
class MessageSystemApplicationSpec extends Specification {

    void contextLoads() {
        expect:
        true
    }
}
