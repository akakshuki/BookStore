$('.quanitty-input').focusout(function () {
    const quantity = $(this).val();
    const bookId = $(this).attr("data-idb");
    $.ajax(
        {
            type: "GET",
            contentType: "application/json",
            url: `http://localhost:8080/changeQuanityBookInCart`,
            cache: false,
            timeout: 600000,
            data: jQuery.param({
                productId: bookId,
                quantity: quantity
            }),
            success: function (rs) {
                if (rs === "Success") window.location.reload();
            },
            // return error?
            error: function (er) {
                console.log(er);
            }
        }
    );
});


$('.btn-delete-cart').on('click', function () {
    const value = $(this).attr("data-cartid");
    $.ajax({
        type: "GET",
        contentType: "application/json",
        url: "http://localhost:8080/deleteAElementInCart",
        cache: false,
        timeout: 600000,
        data: jQuery.param({
            idCart: value
        }),
        success: function (rs) {
            if (rs === "Success") window.location.reload();
        },
        // return error?
        error: function (er) {
            console.log(er);
        }
    });
});



$()