package analitics;

import de.cdp.bi.api.CdpTigerGraphController;

import static org.assertj.core.api.Assertions.assertThat;

//@SpringBootTest
class CdpTigerGraphApplicationTest {

    //    @Autowired
    private CdpTigerGraphController cdpTigergraphController;

    //    @Test
    void contextLoads() {
        assertThat(cdpTigergraphController).isNotNull();
    }
}
