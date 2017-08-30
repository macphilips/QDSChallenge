window.onload = function getDate() {
    var d = new Date();
    console.log(d);                        // -> Sat Feb 28 2004 23:45:26 GMT-0300 (BRT)
    console.log();       // -> Sat Feb 28 23:45:26 2004
    console.log(d.toLocaleDateString());   // -> 02/28/2004
    console.log(d.toLocaleTimeString());
    document.getElementById("date").innerHTML = d.toLocaleString();

};;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;