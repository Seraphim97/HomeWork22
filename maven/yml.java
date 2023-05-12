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
}
