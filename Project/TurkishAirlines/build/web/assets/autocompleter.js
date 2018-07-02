


$(document).ready(function() {
        $(function() {
                $("#osearch").autocomplete({     
                source : function(request, response) {
                $.ajax({
                        url : "OriginCompleter",
                        type : "GET",
                        data : {
                                term : request.term
                        },
                        dataType : "json",
                        success : function(data) {
                                response(data);
                        }
                });
        }
});
});
});


$(document).ready(function() {
        $(function() {
                $("#dsearch").autocomplete({     
                source : function(request, response) {
                $.ajax({
                        url : "OriginCompleter",
                        type : "GET",
                        data : {
                                term : request.term
                        },
                        dataType : "json",
                        success : function(data) {
                                response(data);
                        }
                });
        }
});
});
});