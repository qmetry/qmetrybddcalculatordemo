# QTM Calculator BDD demo
Organizations inject BDD (Behaviour-driven Development) techniques to continuously maintain the quality of product. BDD scenarios align development and testing teams to a common goal. The Automation team transforms the provided usage scenarios into tests. The test run results are then analysed that enable developers to develop and deliver the functionality as expected.

## How configure BDD in QMetry?
    Step 1: Go to QTM -> Projects -> Project/Release/Cycle
    Step 2: Select the target project and on project detail page go to ‘BDD Configuration’ tab.
    Step 3: Click on ‘+’ to add BDD Configuration. It will open ‘Add Configuration’ window.
    Step 4: Add following detail in the fields.
            Version Control System:
            Repository URL:
            User Name and Password - <>
    Step 5: Click on ‘Test’ to verify the connection with repository and Once test is verified click on ‘Save’.

## How to use BDD code with Requirements?
Gherkin editor is provided in the Requirements module. Test Scenarios for requirement are written in BDD code. Once the code is finalized, it can be pushed to GitHub/Bitbucket/SVN for the use of automation testing. Once code is pushed to repository and updated in the repository. Users can pull the updated code from repository to QMetry.

    Push Code to Repository
        Step 1: Open the Requirement details page.
        Step 2: Expand the BDD section on the page.
        Step 3: Write BDD code to the left panel of BDD section.
        Step 4: Add following details in the right panel of BDD section.
            •    Version Control:
            •    Repository:
            •    File Name:
            •    Folder Path:
            •    Notify Automation Engineer: Select any user to be notified on push event
            •    Comment: Add comments in order to push code.
        Step 5: Click on ‘Save’ and ‘Push’.
    Pull Code from Repository
        Step 1: Open the Requirement details page.
        Step 2: Expand the BDD section on the page.
        Step 3: Click on ‘Pull’.
        Step 4: Once latest code is pulled, make necessary changes and ‘Push’ code back to repository.

# For more information -
        https://qmetrysupport.atlassian.net/wiki/spaces/QPro/pages/750944341/BDD+Implementation

