package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.HomePage;
import runner.RunCucumberTest;
import support.Utils;

public class CadastroStep extends RunCucumberTest {
    HomePage homePage = new HomePage(driver);

    @Dado("^que acesso o site da Buger Eats$")
    public void que_acesso_o_site_da_Buger_Eats() throws Throwable {

        homePage.accessWebsite();
    }

    @Dado("^clico em cadastre-se para fazer entregas$")
    public void clico_em_cadastre_se_para_fazer_entregas() throws Throwable {
        homePage.clickRegister();
    }

    @Quando("^preencho os dados do cadastro$")
    public void preencho_os_dados_do_cadastro() throws Throwable {
        homePage.fillFieldsOfRegister();
    }

    @Quando("^clico em cadastre-se para fazer entregas para finalizar o cadastro$")
    public void clico_em_cadastre_se_para_fazer_entregas_para_finalizar_o_cadastro() throws Throwable {
        homePage.clickRegisterFinal();
    }

    @Então("^é apresentada a mensagem de cadastro realizado$")
    public void é_apresentada_a_mensagem_de_cadastro_realizado() throws Throwable {

    }

}
