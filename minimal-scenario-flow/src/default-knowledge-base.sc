theme: /
    state:
        e!: что я здесь делаю?
        e!: зачем я тут?
        e!: почему я тут?
        e!: зачем я здесь?
        random:
            a: тестим немного основных блоков
            a: иногда я тоже задаюсь этим вопросом... 
            a: мы просто смотрим, что не отломалось основное у нас в смартапе
        script:
            $temp.backWay = Zenflow.getBack();
        go!: {{ $temp.backWay }}
    state:
        e!: что делать?
        e!: я не понимаю, что мне делать?
        e!: как с тобой общаться?
        e!: что я могу спросить?
        e!: что делать?
        e!: что писать?
        e!: что вводить?
        e!: как тестировать?
        e!: как тестить?
        a: нажми /start и просто следуй направлению смартапа
        script:
            $temp.backWay = Zenflow.getBack();
        go!: {{ $temp.backWay }}