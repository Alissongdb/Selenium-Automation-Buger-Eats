# language: pt

  Funcionalidade: Se cadastrar para ser um entregador na Buger Eats

    @cadastrar
  Cenario: Se cadastrar na Buger Eats
      Dado que acesso o site da Buger Eats
      E clico em cadastre-se para fazer entregas
      Quando preencho os dados do cadastro
      E clico em cadastre-se para fazer entregas para finalizar o cadastro
      Então é apresentada a mensagem de cadastro realizado