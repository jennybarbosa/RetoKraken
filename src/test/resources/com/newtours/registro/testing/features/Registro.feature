Feature: Registrar usuario

  Scenario: Registro exitoso
    Given I am in registry page
    When I insert data
      | firstName | lastName | phone      | mail                   | address     | city   | state        | postalCode | userName            | password            | passwordConfirm     |
      | Jenny     | Barbosa  | 3189767676 | alejandra6@pruebas.com | calle 56 76 | Bogota | Cundinamarca |     111031 | alejandra.serenity6 | alejandra.serenity6 | alejandra.serenity6 |
    Then I validate "SIGN-OFF" message
