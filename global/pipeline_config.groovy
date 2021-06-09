allow_scm_jenkinsfile = false
skip_default_checkout = true

application_environments {
    development {
        country = [
                es: [
                        country_code                           : "es",
                        country_name                           : "Spain",
                        aws_region                             : "eu-west-1",
                        aws_environment_account_id             : "111111111111",
                        aws_infrastructure_provider_role       : "TestRole",
                        long_name                              : "Development",
                        short_name                             : "dev",
                        k8s_credentials_id                     : "kube-es-dev",
                        batch_helm_chart                       : [
                                name   : 'batch-helm-chart',
                                version: '1.0.0'
                        ],
                        microservice_helm_chart                : [
                                name   : 'microservice-helm-chart',
                                version: '1.0.0'
                        ],
                        helm_global_values                     : [
                                name   : 'helm-global-values-dev',
                                version: '1.0.0'
                        ]
                ]
        ]
    }
    integration {
        country = [
                es: [
                        country_code                           : "es",
                        country_name                           : "Spain",
                        aws_region                             : "eu-west-1",
                        aws_environment_account_id             : "222222222222",
                        aws_infrastructure_provider_role       : "TestRole",
                        long_name                              : "Integration",
                        short_name                             : "int",
                        k8s_credentials_id                     : "kube-es-int",
                        batch_helm_chart                       : [
                                name   : 'batch-helm-chart',
                                version: '1.0.0'
                        ],
                        microservice_helm_chart                : [
                                name   : 'microservice-helm-chart',
                                version: '1.0.0'
                        ],
                        helm_global_values                     : [
                                name   : 'helm-global-values-int',
                                version: '1.0.0'
                        ]
                ]
        ]
    }
    preproduction {
        country = [
                es: [
                        country_code                           : "es",
                        country_name                           : "Spain",
                        aws_region                             : "eu-west-1",
                        aws_environment_account_id             : "333333333333",
                        aws_infrastructure_provider_role       : "TestRole",
                        long_name                              : "Preproduction",
                        short_name                             : "pre",
                        k8s_credentials_id                     : "kube-es-pre",
                        batch_helm_chart                       : [
                                name   : 'batch-helm-chart',
                                version: '1.0.0'
                        ],
                        microservice_helm_chart                : [
                                name   : 'microservice-helm-chart',
                                version: '1.0.0'
                        ],
                        helm_global_values                     : [
                                name   : 'helm-global-values-pre',
                                version: '1.0.0'
                        ]
                ]
        ]
    }
    production {
        country = [
                es: [
                        country_code                           : "es",
                        country_name                           : "Spain",
                        aws_region                             : "eu-west-1",
                        aws_environment_account_id             : "444444444444",
                        aws_infrastructure_provider_role       : "TestRole",
                        long_name                              : "Production",
                        short_name                             : "pro",
                        k8s_credentials_id                     : "kube-es-pro",
                        batch_helm_chart                       : [
                                name   : 'batch-helm-chart',
                                version: '1.0.0'
                        ],
                        microservice_helm_chart                : [
                                name   : 'microservice-helm-chart',
                                version: '1.0.0'
                        ],
                        helm_global_values                     : [
                                name   : 'helm-global-values-pro',
                                version: '1.0.0'
                        ]
                ]
        ]
    }
}

libraries {
    merge = true
    commons {
        aws_region = "eu-west-1"
        aws_master_account_id = "000000000000"
        aws_infrastructure_provider_role = "TestRole"
        sonar_qg_timeout_in_minutes = 1
    }
    bitbucket
    office365
}