$(document).ready(function () {
    var d = new Date();
    document.getElementById("date").innerHTML = d.toLocaleString();
});

function parseJSON(json) {
    var json1 = JSON.stringify(json);
    var col = JSON.parse(json1).column;
    var sort = JSON.parse(json1).order;
    var items = JSON.parse(json1).items;

    console.log(json1);
    console.log(col);
    console.log(sort);

    var result = "";
    var sort_name_url = "";
    var sort_color_url = "";
    var sort_price_url = "";

    if (col == "name") {
        sort_name_url = "/result/name/" + sort;
        sort_color_url = "/result/color/desc";
        sort_price_url = "/result/price/desc";
    } else if (col == "color") {
        sort_name_url = "/result/name/desc";
        sort_color_url = "/result/color/" + sort;
        sort_price_url = "/result/price/desc";
    } else {
        sort_name_url = "/result/name/desc";
        sort_color_url = "/result/color/desc";
        sort_price_url = "/result/price/" + sort;
    }
    result += "<table> ";
    result += "<tr><th><a href=\"" + sort_name_url + "\" " + sort + ">Name </a></th>" +
        "<th><a href=\"" + sort_price_url + "\" " + sort + ">Price </a></th>" +
        "<th><a href=\"" + sort_color_url + "\" " + sort + ">Color </a></th></tr>";
    for (var i = 0; i < items.length; i++) {
        var item = items[i];
        result += "<tr>";
        result += "<td>" + item.name + "</td>";
        result += "<td>" + item.price + "</td>";
        result += "<td>" + item.color + "</td>";
        result += "</tr>";
    }
    result += " </table>";

    document.getElementById("results").innerHTML = result;
}