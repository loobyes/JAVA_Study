/**
 * Created by loon on 2017/8/18.
 */
var http = require("http");
http.createServer(function(request, response) {
    response.writeHead(200, {"Content-Type": "text/plain"});
    response.write("Hello Wsadadorld");
    response.end();
}).listen(8888);
console.log("nodejs start listen 8888 port!");
