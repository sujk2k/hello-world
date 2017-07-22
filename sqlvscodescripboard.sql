-- start docker container for ms sql
-- docker run -e 'ACCEPT_EULA=Y' -e 'SA_PASSWORD=Passw0rd' -p 1433:1433 -d --name juliesqllinux microsoft/mssql-server-linux

-- start sqlcmd shell
-- ./sqlcmd -S localhost -U sa  -P Passw0rdD

-- local mssql docker connection string in vscode
/*
"mssql.connections": [
        {
            "server": "localhost",
            "database": "sujk2kdb",
            "authenticationType": "SqlLogin",
            "user": "sa",
            "password": "",
            "emptyPasswordInput": false,
            "savePassword": true,
            "profileName": "sqldocker"
        }
    ]
    */