package org.adscale

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

def balance = 0

Given(~'^a User has no money in their account$') { ->
    balance = 0
}
When(~'^£(\\d+) is deposited in to the account$') { int deposit ->
    balance += deposit
}
Then(~'^the balance should be £(\\d+)$') { int expectedBalance ->
    assert balance == expectedBalance
}