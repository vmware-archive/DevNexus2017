cd Fortune-Teller-Service
dotnet restore --configfile nuget.config
dotnet publish --output publish --configuration Release --framework netcoreapp1.0 --runtime ubuntu.14.04-x64
cd ..
