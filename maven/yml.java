public class yml {
    name: Java CI simple pipeline with cron
    on:
        push:
            branches: ['*']
    pull_request:
      branches:["main"]
    workflow_dispatch:
    schedule:
    - cron: "30 2 * * *"


//    name: Java CI with Maven - manual run and prepare Allure
//
//    on:
//        push:
//          branches: ['*']
//        pull_request:
//          branches:["main"]
//        workflow_dispatch:
//            inputs:
//                testClassName:
//                  description: 'SimpleTestWithStatuses'
//                  required: true
//    -name: Run tests
//            run: mvn test -Dtest=${{ inputs.SimpleTestWithStatuses}}
}
