@VerifyProducts
Feature: Weryfikacja produktów zamieszczonych na stronie

  Background: Warunki wstępne
    Given : Wejdź na stronę "http://automationpractice.com/index.php"


    @dev
  Scenario: Weryfikacja produktów przeznaczonych dla mężczyzn
  Użytkownik weryfikuje poprawność wyświetlania produktów przeznaczonych dla mężczyzn

    When Kliknij w element "Women"
    Then "Tytuł" jest wyświetlony

