
BlueprintJS demo using [shadow-cljs](https://github.com/thheller/shadow-cljs)
----

### Screenshot

![blueprintjs-cljs](https://user-images.githubusercontent.com/208068/66889581-cecaad00-ef97-11e9-9872-9a09a2b99d26.png)


### Development

Run in developmeent:

```bash
yarn run html
yarn shadow-cljs watch app
```

`shadow-cljs` will be installed in `node_modules/` when you run `yarn`.

`:dev-http` specifies that `target/` will be served at http://localhost:8080 .

### REPL

After page is loaded, you may also start a REPL connected to browser with:

```bash
yarn shadow-cljs cljs-repl app
```

### Release

Compile with optimizations with `release` sub-command:

```bash
yarn shadow-cljs release app
mkdir -p target && cp assets/index.html target/
yarn serve # serving target/ on http://localhost:8080
```

Read docs for more http://doc.shadow-cljs.org/ .

### License

MIT
