
React-intl example using [shadow-cljs](https://github.com/thheller/shadow-cljs)
----

### Dependencies

Install the dependencies with

```bash
yarn install
```

### Development

Run in development mode:

```bash
yarn run html
yarn shadow-cljs watch app
```

Wait for the `Build completed` message before opening the page in the browser.

`shadow-cljs` will be installed in `node_modules/` when you run `yarn install`.

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
