package sample

import org.jetbrains.spek.api.Spek
import kotlin.test.assertEquals

/**
 * @version $Id$
 */
class SampleSpecs : Spek() {
    init {
        given("a dummy spec") {
            on("running") {
                it ("should fail") {
                    assertEquals(2, 3)
                }
            }
        }
    }
}