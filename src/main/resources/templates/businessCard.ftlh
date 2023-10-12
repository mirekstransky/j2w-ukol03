[#ftl]
[#assign x="Unknown"]

[#if member??]
    [#list member as item]
        [#if item.name?? && item.surname??]
            <a class="link-detail" href="/detail/${item?index}">
                <div class="vizitka">
                    <img class="foto" src="/images/image-${item?index}.jpg" alt="${item.name!x}!"/>
                    <div class="status">${item.status!x}</div>
                    <div class="jmeno">${item.name} ${item.surname}</div>
                    <div class="firma">${item.company!x}</div>
                    <div class="udaje">
                        <div class="adresa">
                            <div>${item.street!x}</div>
                            <div><span>${item.postCodeTown!x}</span></div>
                        </div>
                        <div class="kontakty">
                            <div><i class="las la-at"></i> <span>${item.email!x}</span></div>
                            <div><i class="las la-phone-alt"></i> <span>${item.telNumber!x}</span></div>
                            <div><i class="las la-globe"></i> <span>${item.web!x}</span></div>
                        </div>
                    </div>
                </div>
            </a>
        [/#if]
    [/#list]
[#else]
    [#if memberDetail.name?? && memberDetail.surname??]
        <div class="vizitka">
            <img class="foto" src="/images/image-${memberNum}.jpg" alt="${memberDetail.name!x}"/>
            <div class="status">${memberDetail.status!x}</div>
            <div class="jmeno">${memberDetail.name!x} ${memberDetail.surname!x}</div>
            <div class="firma">${memberDetail.company!x}</div>
            <div class="udaje">
                <div class="adresa">
                    <div>${memberDetail.street!x}</div>
                    <div><span>${memberDetail.postCodeTown!x}</span></div>
                </div>
                <div class="kontakty">
                    <div><i class="las la-at"></i> <span>${memberDetail.email!x}</span></div>
                    <div><i class="las la-phone-alt"></i> <span>${memberDetail.telNumber!x}</span></div>
                    <div><i class="las la-globe"></i> <span>${memberDetail.web!x}</span></div>
                </div>
            </div>
        </div>
        [#if memberDetail.fullAdress??]
            <div class="mapa">
                <iframe style="border:none" src="https://frame.mapy.cz/?q=${memberDetail.fullAdress?url}" width="100%"
                        height="100%" frameborder="0"></iframe>
            </div>
        [#else]
            <div class="mapa mapa-error">
                <img style="border-radius: 30px" src="/images/error.jpg" width="100%" height="100%" alt="error">
                <div class="status mapa-neni">Mapa nenalezena</div>
            </div>
            img
        [/#if]
    [/#if]


[/#if]