Feature: Consult the academic portal
  I as a user of the system required  consult the academic portal to make transactions

  Background: Login
    Given Login in the academic portal
      | user       | pass     |
      | 1152702267 | M108586H |

  @Modify_Data
  Scenario: Modify personal data
    When the user enters the data
      | identification | name    | firstLastName | secondLastName |
      | 70089143       | Antonio | Molina        | Osorio         |
      | 42866832       | Ofelia  | Velásquez     | Salazar        |
    Then It is validated that the father's name has been saved ANTONIO MOLINA OSORIO

  @Subjects_2019
  Scenario: Consult 2019 subjects
    When  you enter the class schedule section
    Then The name of the subject INVESTIGACION DE OPERACIONES is validated

  @Credits_Pending
  Scenario: pending credits of professional disciplinary matters
    When  you enter the section of all my notes
    Then It is validated that the number of outstanding credits is equal to 15

  @Average_notes
  Scenario: Calculed average grade per semester
    When Enter the notes section by semester
    Then It is validated that the average is equal to 4.18

  @Smoke_test
  Scenario: Initial application load
    Then Visibility title Portal de Servicios

  @Consult_Schedule
  Scenario: Consult schedule
    When the user of the system consult the class schedule 1152702267
    Then Visibility message COLOMBIANO

  @Material_Earrings
  Scenario: Consult material earrings
    When the user required consult the material pendding
    Then Validated name material pendding TRABAJO DE GRADO

  @Cant_Material
  Scenario: number of subjects enrolled
    When Enrolled subjects are consulted
    Then It is validated that the quantity is equal to 5

  @Amount_Credits
  Scenario: amount of credits assigned
    When  Enrolled subjects are consulted
    Then  It is validated that the number of credits is equal to 14

  @Confirmation_Payment
  Scenario: Payments made
    When the payments made are consulted
    Then the last successful payment is validated SI

  @Cancellation_section
  Scenario: Cancellation of subjects section
    When you enter the section
    Then verify the existence of the section Cancela

  @Story_Academic
  Scenario: Story academic section
    When you enter the section story academic
    Then verify the existence section story academic Mis expedientes

  @Economic_Summary
  Scenario: the user consults the payment reference for the year 2017-1
    When when you enter the payment summary section
    Then it is verified that the payment reference is equal to 2302168014

  @Acknowledgments
  Scenario: consult approved recognitions
    When you enter the recognitions
    Then it is validated that they are approved APROBADO

  @Invalid_User
  Scenario: Login with invalid user
    Given The user tries to enter
      | user     | pass     |
      | 70089143 | 00000000 |
    Then The message is validated Vuelva a intentarlo.

  @Enter_sigOf
  Scenario: Enter data and log out
    When personal data is entered and session is closed without saving
      | identification | name     | firstLastName | secondLastName |
      | 1153267121     | Bernardo | Suarez        | Aguilar        |
      | 1152706257     | Ortencia | Maldonado     | Juarez         |
    Then indicates by means of a message that the data will be lost Los datos ingresados se perderan





