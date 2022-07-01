<#include 'footer.ftl'>

<#macro boilerplate>
    <html lang="en">
    <head>
        <title>${title}</title>
        <link rel="stylesheet" href="../styling/style.css">
        <script src="../styling/script.ts"></script>
    </head>
    <body>
    <#nested>
    </body>
    <@footer></@footer>
    </html>
</#macro>