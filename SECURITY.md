# Security Policy

## Supported Versions

| Version | Supported          |
|---------|--------------------|
| 1.0     | :white_check_mark: |

## Reporting a Vulnerability

If you discover a vulnerability in the Java TCP Chat Application:

1. **Do not disclose it publicly.**
2. Email your findings directly to: `arshanthk@gmail.com`
3. Provide detailed steps to reproduce the issue, proof-of-concept code, and the potential impact.

All reports will be reviewed within **72 hours**, and appropriate action will be taken as quickly as possible.

## Known Issues

- This project does not implement encrypted communication (e.g., SSL/TLS).
- No authentication is currently used—users are anonymous.
- Message integrity is not verified.
- The server is not protected against Denial of Service (DoS) attacks or malicious payloads.

These limitations should be considered **if used in production or over public networks**.

## Recommendations

- Deploy behind a firewall for internal communication.
- Do not expose the server to the open internet without TLS and authentication layers.
- Consider extending the project with:
  - SSL sockets (`SSLSocket`)
  - User authentication
  - Rate limiting
