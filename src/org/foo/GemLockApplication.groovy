GEM
  remote: https://rubygems.org/
  specs:
    CFPropertyList (2.3.5)
    addressable (2.4.0)
    ast (2.3.0)
    aws-sdk-v1 (1.66.0)
      json (~> 1.4)
      nokogiri (>= 1.4.4)
    backports (3.6.8)
    backticks (0.5.0)
    beaker (2.52.0)
      aws-sdk-v1 (~> 1.57)
      beaker-answers (~> 0.0)
      beaker-hiera (~> 0.0)
      beaker-hostgenerator
      beaker-pe (~> 0.0)
      docker-api
      fission (~> 0.4)
      fog (~> 1.25, < 1.35.0)
      fog-google (~> 0.0.9)
      google-api-client (~> 0.8, < 0.9.5)
      hocon (~> 1.0)
      in-parallel (~> 0.1)
      inifile (~> 2.0)
      json (~> 1.8)
      mime-types (~> 2.99)
      minitest (~> 5.4)
      net-scp (~> 1.2)
      net-ssh (~> 2.9)
      open_uri_redirections (~> 0.2.1)
      public_suffix (< 1.5.0)
      rbvmomi (~> 1.8, < 1.9.0)
      rsync (~> 1.0.9)
      stringify-hash (~> 0.0)
      unf (~> 0.1)
    beaker-answers (0.14.0)
      hocon (~> 1.0)
      require_all (~> 1.3.2)
      stringify-hash (~> 0.0.0)
    beaker-hiera (0.1.1)
      stringify-hash (~> 0.0.0)
    beaker-hostgenerator (0.8.3)
      deep_merge (~> 1.0)
      stringify-hash (~> 0.0.0)
    beaker-pe (0.12.2)
      stringify-hash (~> 0.0.0)
    beaker-rspec (5.6.0)
      beaker (~> 2.0)
      rspec
      serverspec (~> 2)
      specinfra (~> 2)
    builder (3.2.3)
    deep_merge (1.1.1)
    diff-lcs (1.3)
    docker (0.3.2)
      backticks (~> 0.3)
    docker-api (1.33.2)
      excon (>= 0.38.0)
      json
    domain_name (0.5.20170223)
      unf (>= 0.0.5, < 1.0.0)
    ethon (0.10.1)
      ffi (>= 1.3.0)
    excon (0.55.0)
    facter (2.4.6)
    faraday (0.11.0)
      multipart-post (>= 1.2, < 3)
    faraday_middleware (0.11.0.1)
      faraday (>= 0.7.4, < 1.0)
    fast_gettext (1.1.0)
    ffi (1.9.18)
    fission (0.5.0)
      CFPropertyList (~> 2.2)
    fog (1.34.0)
      fog-atmos
      fog-aws (>= 0.6.0)
      fog-brightbox (~> 0.4)
      fog-core (~> 1.32)
      fog-dynect (~> 0.0.2)
      fog-ecloud (~> 0.1)
      fog-google (>= 0.0.2)
      fog-json
      fog-local
      fog-powerdns (>= 0.1.1)
      fog-profitbricks
      fog-radosgw (>= 0.0.2)
      fog-riakcs
      fog-sakuracloud (>= 0.0.4)
      fog-serverlove
      fog-softlayer
      fog-storm_on_demand
      fog-terremark
      fog-vmfusion
      fog-voxel
      fog-xml (~> 0.1.1)
      ipaddress (~> 0.5)
      nokogiri (~> 1.5, >= 1.5.11)
    fog-atmos (0.1.0)
      fog-core
      fog-xml
    fog-aws (1.2.1)
      fog-core (~> 1.38)
      fog-json (~> 1.0)
      fog-xml (~> 0.1)
      ipaddress (~> 0.8)
    fog-brightbox (0.11.0)
      fog-core (~> 1.22)
      fog-json
      inflecto (~> 0.0.2)
    fog-core (1.43.0)
      builder
      excon (~> 0.49)
      formatador (~> 0.2)
    fog-dynect (0.0.3)
      fog-core
      fog-json
      fog-xml
    fog-ecloud (0.3.0)
      fog-core
      fog-xml
    fog-google (0.0.9)
      fog-core
      fog-json
      fog-xml
    fog-json (1.0.2)
      fog-core (~> 1.0)
      multi_json (~> 1.10)
    fog-local (0.3.1)
      fog-core (~> 1.27)
    fog-powerdns (0.1.1)
      fog-core (~> 1.27)
      fog-json (~> 1.0)
      fog-xml (~> 0.1)
    fog-profitbricks (3.0.0)
      fog-core (~> 1.42)
      fog-json (~> 1.0)
    fog-radosgw (0.0.5)
      fog-core (>= 1.21.0)
      fog-json
      fog-xml (>= 0.0.1)
    fog-riakcs (0.1.0)
      fog-core
      fog-json
      fog-xml
    fog-sakuracloud (1.7.5)
      fog-core
      fog-json
    fog-serverlove (0.1.2)
      fog-core
      fog-json
    fog-softlayer (1.1.4)
      fog-core
      fog-json
    fog-storm_on_demand (0.1.1)
      fog-core
      fog-json
    fog-terremark (0.1.0)
      fog-core
      fog-xml
    fog-vmfusion (0.1.0)
      fission
      fog-core
    fog-voxel (0.1.0)
      fog-core
      fog-xml
    fog-xml (0.1.2)
      fog-core
      nokogiri (~> 1.5, >= 1.5.11)
    formatador (0.2.5)
    gettext (3.2.2)
      locale (>= 2.0.5)
      text (>= 1.3.0)
    gettext-setup (0.18)
      fast_gettext (~> 1.1.0)
      gettext (>= 3.0.2)
      locale
    gh (0.15.1)
      addressable (~> 2.4.0)
      backports
      faraday (~> 0.8)
      multi_json (~> 1.0)
      net-http-persistent (~> 2.9)
      net-http-pipeline
    git (1.3.0)
    google-api-client (0.9.4)
      addressable (~> 2.3)
      googleauth (~> 0.5)
      httpclient (~> 2.7)
      hurley (~> 0.1)
      memoist (~> 0.11)
      mime-types (>= 1.6)
      representable (~> 2.3.0)
      retriable (~> 2.0)
      thor (~> 0.19)
    googleauth (0.5.1)
      faraday (~> 0.9)
      jwt (~> 1.4)
      logging (~> 2.0)
      memoist (~> 0.12)
      multi_json (~> 1.11)
      os (~> 0.9)
      signet (~> 0.7)
    hiera (1.3.4)
      json_pure
    highline (1.7.8)
    hocon (1.2.4)
    http-cookie (1.0.3)
      domain_name (~> 0.5)
    httpclient (2.8.3)
    hurley (0.2)
    in-parallel (0.1.17)
    inflecto (0.0.2)
    inifile (2.0.2)
    ipaddress (0.8.3)
    json (1.8.6)
    json_pure (2.0.3)
    jwt (1.5.6)
    launchy (2.4.3)
      addressable (~> 2.3)
    little-plugger (1.1.4)
    locale (2.1.2)
    logging (2.2.0)
      little-plugger (~> 1.1)
      multi_json (~> 1.10)
    memoist (0.15.0)
    metaclass (0.0.4)
    metadata-json-lint (1.1.0)
      json
      semantic_puppet (>= 0.1.2, < 2.0.0)
      spdx-licenses (~> 1.0)
    mime-types (2.99.3)
    mini_portile2 (2.1.0)
    minitest (5.10.1)
    mocha (1.2.1)
      metaclass (~> 0.0.1)
    multi_json (1.12.1)
    multipart-post (2.0.0)
    net-http-persistent (2.9.4)
    net-http-pipeline (1.0.1)
    net-scp (1.2.1)
      net-ssh (>= 2.6.5)
    net-ssh (2.9.4)
    net-telnet (0.1.1)
    netrc (0.11.0)
    nokogiri (1.7.0.1)
      mini_portile2 (~> 2.1.0)
    open_uri_redirections (0.2.1)
    os (0.9.6)
    parser (2.4.0.0)
      ast (~> 2.2)
    powerpack (0.1.1)
    public_suffix (1.4.6)
    puppet (3.7.4)
      facter (> 1.6, < 3)
      hiera (~> 1.0)
      json_pure
    puppet-blacksmith (3.4.0)
      puppet (>= 2.7.16)
      rest-client (~> 1.8.0)
    puppet-lint (2.1.1)
    puppet-syntax (2.4.0)
      rake
    puppetlabs_spec_helper (2.1.0)
      mocha (~> 1.0)
      puppet-lint (~> 2.0)
      puppet-syntax (~> 2.0)
      rspec-puppet (~> 2.0)
    pusher-client (0.6.2)
      json
      websocket (~> 1.0)
    rainbow (2.1.0)
    rake (12.0.0)
    rbvmomi (1.8.2)
      builder
      nokogiri (>= 1.4.1)
      trollop
    representable (2.3.0)
      uber (~> 0.0.7)
    require_all (1.3.3)
    rest-client (1.8.0)
      http-cookie (>= 1.0.2, < 2.0)
      mime-types (>= 1.16, < 3.0)
      netrc (~> 0.7)
    retriable (2.1.0)
    rspec (3.5.0)
      rspec-core (~> 3.5.0)
      rspec-expectations (~> 3.5.0)
      rspec-mocks (~> 3.5.0)
    rspec-core (3.5.4)
      rspec-support (~> 3.5.0)
    rspec-expectations (3.5.0)
      diff-lcs (>= 1.2.0, < 2.0)
      rspec-support (~> 3.5.0)
    rspec-its (1.2.0)
      rspec-core (>= 3.0.0)
      rspec-expectations (>= 3.0.0)
    rspec-mocks (3.5.0)
      diff-lcs (>= 1.2.0, < 2.0)
      rspec-support (~> 3.5.0)
    rspec-puppet (2.5.0)
      rspec
    rspec-support (3.5.0)
    rsync (1.0.9)
    rubocop (0.47.1)
      parser (>= 2.3.3.1, < 3.0)
      powerpack (~> 0.1)
      rainbow (>= 1.99.1, < 3.0)
      ruby-progressbar (~> 1.7)
      unicode-display_width (~> 1.0, >= 1.0.1)
    ruby-progressbar (1.8.1)
    semantic_puppet (0.1.4)
      gettext-setup (>= 0.3)
    serverspec (2.38.0)
      multi_json
      rspec (~> 3.0)
      rspec-its
      specinfra (~> 2.53)
    sfl (2.3)
    signet (0.7.3)
      addressable (~> 2.3)
      faraday (~> 0.9)
      jwt (~> 1.5)
      multi_json (~> 1.10)
    spdx-licenses (1.1.0)
    specinfra (2.67.3)
      net-scp
      net-ssh (>= 2.7, < 5.0)
      net-telnet
      sfl
    stringify-hash (0.0.2)
    text (1.3.1)
    thor (0.19.4)
    travis (1.8.8)
      backports
      faraday (~> 0.9)
      faraday_middleware (~> 0.9, >= 0.9.1)
      gh (~> 0.13)
      highline (~> 1.6)
      launchy (~> 2.1)
      pusher-client (~> 0.4)
      typhoeus (~> 0.6, >= 0.6.8)
    trollop (2.1.2)
    typhoeus (0.8.0)
      ethon (>= 0.8.0)
    uber (0.0.15)
    unf (0.1.4)
      unf_ext
    unf_ext (0.0.7.2)
    unicode-display_width (1.1.3)
    websocket (1.2.4)

PLATFORMS
  ruby

DEPENDENCIES
  beaker (= 2.52.0)
  beaker-hostgenerator
  beaker-rspec (= 5.6.0)
  docker
  docker-api
  facter (>= 1.7.0)
  git
  metadata-json-lint
  nokogiri (= 1.7.0.1)
  puppet (= 3.7.4)
  puppet-blacksmith (>= 1.0.0)
  puppet-lint (>= 1.0.0)
  puppetlabs_spec_helper (>= 1.0.0)
  rainbow (>= 2.1.0, < 2.2.0)
  rake
  rspec
  rspec-puppet
  rubocop
  serverspec
  travis
  unf_ext

BUNDLED WITH
   1.14.6
