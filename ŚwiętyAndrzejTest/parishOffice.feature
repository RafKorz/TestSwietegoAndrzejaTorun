Feature: Navigate on andrzej-torun.pl

Scenario: Test of parish office in andrzej-torun.pl
Given a user in a andrzej-torun.pl website
When the user go to to "Biuro parafialne" subpage
Then the user should see parish office work area
And mobile contact
And adress of the parish office