<#include 'footer.ftl'>

<#macro boilerplate>
    <html lang="en">
    <head>
        <title>Inventorio</title>
        <link rel="stylesheet" href="/static/css/style.css">
        <script src="/static/js/script.ts"></script>
    </head>
    <body>
    <#nested>
    </body>
    <@footer></@footer>
    </html>
</#macro>