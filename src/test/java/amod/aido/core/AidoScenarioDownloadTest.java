/* amodeus - Copyright (c) 2018, ETH Zurich, Institute for Dynamic Systems and Control */
package amod.aido.core;

import java.io.File;
import java.io.IOException;

import amod.aido.core.AidoScenarioDownload;
import ch.ethz.idsc.amodeus.util.io.MultiFileTools;
import junit.framework.TestCase;

public class AidoScenarioDownloadTest extends TestCase {
    public void testSimple() throws IOException {
        File file = new File(MultiFileTools.getWorkingDirectory(), "scenario.zip"); // <3MB
        assertFalse(file.exists());
        AidoScenarioDownload.of("SanFrancisco.20080519", file);
        assertTrue(file.isFile());
        file.delete();
    }
}
