<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org">

<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>Sharda Vidhya Niketan</title>
<link rel="icon" href="Images/Schoolsimg.png" type="Image/icon type">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous" />
<link rel="stylesheet" href="style.module.css" />

</head>

<body>
	<header style="box-shadow: 0 5px 10px rgb(0 0 0/ 0.2)">
		<div class="header_section"
			style="padding: 3px; display: flex; justify-content: space-between; align-items: center; margin: 0px 30px;">
			<div>
				<img
					src="data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBxISEhUSExIVFhUXFRgbGBgYFxggHxsgIhgXHh8iFx4eHSggHxolGxsgJTEiJSk3Li4xIB81OTgsOCgtLisBCgoKDg0OGxAQGjYmICYxKzcyNi0tLy8vLS0tLS8tLS0tLS0tLy8vMi0tLS0yLy0tLy0tLS0tLSstLS0tMi0tLf/AABEIAMgAxgMBIgACEQEDEQH/xAAcAAEAAgMBAQEAAAAAAAAAAAAABQYDBAcCAQj/xABGEAACAQIEAwQHBQUGAwkAAAABAgMAEQQFEiEGMUETIlFhBzJCcYGRoRQjUnKxYoKSwdEVFiQzU6Kys/ElNENVY4OjwuP/xAAbAQEAAwEBAQEAAAAAAAAAAAAAAwQFBgIBB//EADsRAAEDAgMFBgUCBAYDAAAAAAEAAgMRIQQxQQUSUWFxIoGRscHwEzJSodFC4TNisvEGFDSCksIjU3L/2gAMAwEAAhEDEQA/AO40pSiJSlKIlKUoiUpSiJSlKIlKUoiUpSiJSlKIlKUoiUpSiJSlKIlKUoiUpSiJSlKIlKUoiUpSiJSlYcROkal3ZVVRcsxAAHmTsKIs1YppVQFmYKo5kkAD3k1ScRxjPinMOWwGS2zTyCyL7gbe/ffb1TUdjuH4xG2KzLGS4rQ4UxxE6VYsF0gLve5GwC+6rYwlCBKaHhSrvDTvIVcz1HYFeeQ8de6qsWZ8f5fCSO37Rh0jBb5MO79a0B6QC+8GX4uUeOi36aq2Md9nwWCOKwcEBsIyrW2ZWdQSX9b1WvcnatNOKpXlKDuaMdh4nRlFwkiWKtz3EoNnHMWtsakZHGW7zWE0+p1OGgFdRqvJe/e3S6nQddT04LL/AHzx3/k2I/j/APzp/f8AZN58uxcY8dF/1C1p5VxDiHWZppCpjgxDwjStptEkoLX02vHpVdH7xvfbLhM7xX2KOZZ0eVp4o7MInVi/ZrpHZFQtixax721j41I6JgNDGMwLOdr499rLy17iKhx8Bp4d175qUy30gZfMQO27Nj0kUr829X61ZYJ1dQyMGU8ipBB9xG1VLOcRh2mhw+Iw0WIkcossioAIy+oId7sC5U2XVcAXvyvEnhmFJZf7Oxr4eaJ1V4yxMephdVN+d/3txa16hMMLhUVb17QzpmLivMcDlSvv4kjc6H7H72+66TSqHh+MMRhGEWZQaATZcRGLo3vA+e2/7Iq6YTEpKgkjZXRhcMpBB9xFV5YXx3ORyIuD0IUrJWvyz4HNbFKUqJSJSlKIlKUoiUpSiJSlKIlKUoiUpWhm+ZR4aF5pGsiC58T4AeJJ2FfQCTQZr4TQVKw59ncOEiMszWA2AHrMfBR1P0HM2FUn7JLj2jnzFzBhnlVYMMCw1sb6dZtcXtYE2J6abi+3kWUy4+T+0MWoAsfssDXKoPZZhtqvsfPny0gbK4XES4lo8VhbxzQGOZ42vEShDRul++j3dhpIuDpIJ0k1fZuw1DT2hmbW5NrrxPGw+pVXVkoSOzoOPM+g7zwWpl+YtKI8MY0w8UkskIjhkdJoHjUvckbMO7ckC3eW+oHeSwXDkhgkgmkIJxfa9qlgzjtFkvZbdm5NxtyIuKmcuyeOI9pbXMUVHmYDW4UAd4geQ5c7CmLzaNCQDqYc7HYe88vhVPE42OFu9UNGfeOHHzOZvRTxwOdnc+i84DI4IomgRLxMWJjcl171tQAYnuk728ST1qQ7EC7WAJtc2G9uVz5VR8345SMka9/wp/M7mqrjOOnb1Yx72JJ+pqpG/G4ob8EDnA6uIYDzBdc9V6e/Dw9l7wOQv5LsRkH4l+Yry0Cta6q1mDDYGxHIjzHjzri78UYrsw5VNFyAdK8wAT59efv8K1U4pk57A+K3U/Q1K3DbTz+ACMuzI00IzHUHReDicNq+mt2kWORyXYcRw9hndZDEqyCVZdagBiwI5tzKm1iOVV6Tho4eWKe7zolnkRUBkmn7SQo5Gy2HasblgF0rfYbVnLePcQhtr1D8Mo1f7hYirxkfGEGIsr/dOeQY3U/lbx8jb40btB0bvhS1YeD7W5HyIPNezC17d9lCOIWzxPmKRRhDCs/aOqGMsoFmJALlgQFLAKCRYsVFxeqv/Z82BticAHaF1WSXBS31oCOYXdgRYjxBX2xsLjm2RQYmxmj1FRa92FxdW0vpI1JqUHSdrgVVZu1wUzSyz9xxHJiJ2iW7sC2mHDb3IIFtFjoAJvdttDDO7O43M5g1o7lavcfmrShOkEzb7zu4jTn+RlTRWvh3PocZEJYm8mU+sp8GH8+R6VMVzPGo8bPmWCiMckbacZhSRuLBye7dSSrBrr435hgb3kmaxYqFZ4jdWHxB6hvAg1FPCG9tmX3B4H0OouvcUhPZdn9iOI/GikaUpVZTJSlKIlKUoiUpSiJSlKIlc3zbGR4/FMZXC4DBG8hJ2kk3FvPfYAXJF7euKsfHmcnC4RmS/ayERxW56mvuPMC5Hnaq0Y4MLFFlzISy9lLKySMsvaOxAbDqqlpWQi5tyULzO1X8Kwtb8SlzYUpYfqPUVoOZroq0zt47nDP0Hqei3sSsmIxSyYXETKhIjltrH2dkRms0Mg06ZFsLsuzWO+q1XFO6o1Ney95jYXsNybbDx8KiuG8vZQ87yPJJNoJaSMRsFVbIroOTC5JNhck7DlUFxrnYu0CtZEF5W8T+EeQ6jqbDpVDHYlsbQAK0oBTNxOQyBPDLIZVU8MZJqevQf295JxDxUCGCPohGxfq/kvWx8BufIVzvNuI5Je4l44/LmfeRy9w+taGZ49pmudlHqr4D+p6mtOtXZmwmsIxGMAdLwzazkBcEjU8cuJysZtJz/wDxw2b9z+3LxXmleqs/DWSq0T4mUgIgJW5sLjqfj0HX3WOxtDaEWBhM82VupJyA6qlhMK/EyCJlvIDiss2Bb7IE+y2sNerX379WI6i21rcvPeqnV/xOOhEXamcl27nZjUSGAGpddrFlU3tyJFhUHxVkaxBJo7GNwp7p23FwVP4T0/nzrm9ibTEc5w057UhJbckb2rbk92RN63otzbGC3o2yxCzRQigFtDkO/QaUuq5W5gseUO/eXqK06V1GJwsOJjMUzQ5vP0OYPMUPNc/DM+F2+w0PvxXWeEeJ7KFZi8XIH2k8j1t5dOm1XDM8vjxERRjsysFdbal1KVJjJBsdLEXHQ1wPKsxaBw67j2l6MP6+B6V2ThTM1ZFAbVG4uh8D1B8N7i3Q1xOKw0uy52xuO9E49hxzafpd6HW+ladJhsQ3FsJpRwzGh5j36V01kfDT6VhIUBmTDYURqoQnR2kzMUDyOdlQeHUi9R2BxKYDFRzRH/AY6zDoInIuPyjflttf8FWPi/L4TC+JdZC0MZb7tyhYKRJpYj2dag35ra4tveKkgOMSXL5fs5PYJLG+HB0Rm9lBBJtvuCLal1bCtaJ7S2rhY2d049RY+Na1UD2urQZjL8d+X3V6pVX4AzdsRhQJL9tCxikB53XkT5kcz4g1aKoyRmN5YdFZY4OaHDVKUpXhekpSlESlKURKUpRFRszH2rOIIuceEjMrj9s20/LuH519zCXEy4lcJiYsP2byPoLQs4ZACw0OZABKQLEaQRYsLgVi4JBlkzLFhdZedkQXsSEBsA3S4ZRetzhbBzLM5kjxUa7mNXxIljC6YwAfvGbXq1EEjl1rRkIYafS0DStSKkjoTexy0VRl78STypl5Dkp3iDMOww7yD1rWUftHYfLn8K4jxFjCbRXJt3nPix33+d/ea6T6RsZYxx9FVpG/Rf0auPTSFiWPMkk1V2PhxiMe6V3yxAU/+3a9wB76HRNpTfDgDBm/yH5K80pSuyXOrbwOWyS30gWsTcmw2F7e89KsmNzNBlsUKo7ySshAVSbBZLsz7+qAdt9zYCsHDkn+FnCorSC5W9trrYkDxG5HmBXjhqJmkjjBAAXWSRse9bl1JuLVxX+IZRKx3xCKRSNp13Se1reraLrtjYQCj2EirCSejgAG/forVmWNm7ESWIEkW4WIHSSdze/Prb1ue/Wq1PmZOAbDTRFJYdIuCWR1JurRsNrW2IPLarEsTbByVjDaSWa1rN3tQPsra9+oA86i+Js3wh7bTGrxhmAlLhY1sqoLNuWPduNFydqxsOQZYpXtJo9hFMxStT0tlzsaq9iXOex0TTTsu0sTS1e4n7FUhEJNgK3JspmRS7R2AO9yLjz03va+17WqYzfBrHhcPLAq2kUMzOhLC67Hc216vKw6AVWoEMmJj1DUTIpLMSXKhbXLEhQu248q7B22HGIzsaAwcalxI0oDaulbZEVWANlNY8RSOJceFgBxq4CtOA76JVu9H+aaJTh2Pdk3TycDp+YD5gVWcyKmWTRbRqOm3K1za3lasUErIyupsykMD5g3H1q9j8EzaGDdA8U3hauYdmPA58q6LMw8xw0weDWh7iNffQr9H4KbWgJ59aosGJaHHtFG5EcbgyQ4bBgKxawRWYBuSsGdywHqgC97WfhzGCRFYcnRXHyH9aiOJMDimml0faXDxKIhFOI0jezAmUa1Om9muL3sRbx5PY05mhHxbGhBrT5gaHMdTouhxTKOG7lnbhRYcKPsmdOg2jxkWsActa3v8dmP71XqqJ6QFMP2DFMbtBiEVj4hgNXwOj61e6u4jtMY/iKf8beVFHFZzm86+N/OqUpSqqmSlKURKUpRErHM+lS3gCfkKyVr45bxuPFG/Q0RUn0dYAS5S8ZYr25nBYcxqul/pU1kfDf2eXtjIGdoyrlYwmolwQTue6iKqInsgNz1Vp+ip75bF5NIP/karhVzGSO+NI0GxcfNV4GNMbDTIDyXK/SNLeaf9lEX6A//AGrm9dI9IUN3xZ8FjP0jrm9T/wCGLxTnX4rvsG0VHbH8Rg/l8yUpSpDKMAJWGo2XVb+pPgo2ufOuillbEwvdks2KJ0rtxmaneAkkRmxAA7IMqNfmST7I66Qd/I1nxUxixcbQWmddfbFTsNrR9NKkNzPgPGpnB5e6qqyFBAl3sLhQLG9+W25JNU/Ktea46SMzdlhQpYoO6rC4CLYW7zHcsd9j5VweLlOKxLpiAKaHhkKnKppbQkUquzhjGFw7Yg6teHO5A5cfzRZcTiMRjZZEjAnKsxkJYrhYTuTrbnIwF9hzsdqneE8jhRjiMTIJ5QtoyygLGTcfcx8lIOwNidjyrdxGB7DuBNMSoQEULotbe3Tc2ufnVowuTfcxkFWeIEoQANiSSpvtp8DzHOq4dK8kMBaRd1aCrjp5m1ja6m3o2t7ZqDlS9hrrmaDiNGhcl4jzrDzAqpJ0EiIeLdSBzt4E25moiR7n5/Xnb32q08U5AdTYhdCllLPGbKRtdtPQjfle9/G9VOup2DhoWQmSJ+9WlvppoeetfCy5zbM8xkDJG0pWnMZW5eylKUrfWIuuej3E/c4UeTr8i/8AQVKcR8OzYnEJJG0cOiJl7YGTtLlgRYIyCy2NtTEd9u7Va9Hzd3CL4tIf+af5V1Gvz/COMOIxJZ/7Zad5uurLRJDHvfS3yVJ9JWGIypwzFzH2PeNrsQ6qSbbXN77VbcBLriRvxIp+ag1XfSef+zMR/wC3/wA1KnsoW0EQ8Ik/4RWg7/TNP8zvJqib/GPQeZW7SlKrKdKUpREpSlESvlfaURUj0WdzDzwH1ocTIpHy/nervVHyL/D5vjIDsuIRZk8yPWt8Wb+GrxVrGXlLvqofEfmqhw4owN4VHh+ypfF2X65HH+rAQPzDUP1K1xav0TnmG1IHHNDf4Hn/ACPwriPF+XdjiXIHck7y/E7j4Nf4WrzsCb4OOmw7v1gPb1Ao4dcu4KvtWLehZINKg9+XvmoeJgGBZdS3FwDa46i9jb32rrHDeFws8ET4cFCjENqCF7X7ysQAGOm1id7WO+9clqycDZ59mm0sbJJYHwDdCfI3tf3V0O0sOZoTStRpxWbgcR8KT14KZzXh3OMVIYSYlw/aMupTZWAAZWcbtY3A0/iBuLAE7vo94TlwqzfaoFZpnAUd1raCwB1dN7t7rddqveXYsGMi9jY/P/rW4k4Edx0Fcs2NrG7gaKeNeZrWp66WW+ZS47xN/fBUbNo+zbTGlm7RUAOytfcrex3AOrblW7gsdiUlCdgdOwksQR7/AB38OVSnEZXTCCAbOWF/EId/fvXjK8YohMrHck9T02PLfmKo4WGOKeRja6HgL1tTKgoaa3pwVt8znRNNLXB1va9eajMwyHDLKqdmp7V9TKbkLtdrdbHlbl5VA8c8OZfh4u1UPFIdkRDsx6ag17bbm1T2HzFZD2y762Krz9VX3t1Opl5+QrnPGWbHE4hjclUuo9/tH5i3wroNmQESBsZ3QLmlvfoOix9oT1bV9zkK+/FQVea9VIZHhO0lW47q95vcOnxNh8a6GedmHidNJk0Enu9TosSKJ0rwxuZsuj8DYY9tGv8AowEn8zWH6s3yrotVjgbBFYmmbnK1x+UXA+ZLH4irPXA4EO+CHP8AmcS49XGq62Sm9QZC3gqT6V2JwSxD1ppo0A+Z/UCrnGgAAHICwqlcTff5pgcOOUWqZ/h6t/iv+6rxWpLaGNvU+Jp/1VVl5HnoPAV9UpSlVlMlKUoiUpSiJSlKIqN6QomgfDZigJOHkCyW5mNtj+pH71XOCZXVXUgqwBUjqCLgj4VizHBpPE8MgujqVYeRHTzqp8A414jJls5+9w5PZk+3GdwR7r/IgdDVr+LBbNn9JPoSe48lB8knJ3mPyPJXYi+1UDjPh3tUMYsGF2iY/VSfAjY/umugVrY3CrKuk/A+FZeJied2WE0kYatPPUHkRY/eysjdILXirTn75L82yIVJVgQQSCDzBHMHzq6cEZbhCwaRkmkIBCbER7jexN2YHn09/Ot/jThvWxYALKB8HHTfx6BvgfEV3IM8GE1RTQ3Gq5NgGXlt422B510uG2m3aOGPw6tkHzM/UOOeY4EdDexw5MKcLKN+7TkdD+66jjo2DIYwgLHvFiwFj7S87MGsPCxPhXnW6koVbw2sfkOdRC8aYBlTWxHldj1HrAC9tuvOk3pGwoB0lmbUbfd2Gm/iWBuRvy2vy2rOfh5hkx3cD6ArRjfG803mjqQPMhbfEGEnMStYgq217bXBHesdv62qIfF9pGuHQeCte4K352t1O9uhrJiPSNh5FKGKSxPeDBSLeC6SD7ievjUO+e4ZnLRy6DHpKNJGQ787qSh03W3rG3MfHNnweJEwxDI3VA+kio/4+6Z6HShlgEXwnPbStR2gb20DuX3rotvDZ/hsMQj9oNF9KogO1yRpbUOu3TcVVeJM8jxLHssLFCt7khV7Rj4uwG3jYfEmtHN8V2kh2FlFl08rAn5kkk3861YIWdgiKWZjYKBcn3Cuo2Xs8QQRukrvBorewoOg63qBc50XN47FulleG5EnTn76rwqkkAAkk2AHM+7zrofC/DhJWH2jZpmHsgeyD49B5knkKcM8KtFYsA2II2AOyDqQeWrxbkOQvzrpGU5YsCaRux3ZvE/0HQVgbT2kNpP+BB/Baaud9ZGQH8o14kVyDSdHA4M4YfEk+c5D6R+fJbsUYUBVFgAAAOgHKkkgUFiQABck9B1vWSqX6QMxdhHl8B++xRsf2I/aJ8iAfgH8q9wxGR4aP7DU9ynkfuNr76LFwCpxE+KzFgbSv2cV+iLb9bKPepq81o5VgEw8McCDuooUefiT5k7n31vV9nkEkhcMtOgsPsvkbd1tDnr1NylKUqJSJSlKIlKUoiUpSiJVR42ySSTRi8NtisPutvbXe6Hx5mw63YddrdSpIpDG4Ob74jvXl7A9u6VCcMZ/HjYBKmzcnTqjdQfLwPUfKpuqPxFkU2HmOPwIu/OeDpKOZIH4+viTuN7htvDcf4BoVlaXQTzjIYuD4WUG48DyNTPg3u3CKtOmZB4H0ORHOqibLu9mQ0P2PMfjTwJsGY5fHOmiQXHQjYg+Knoa5rxTwlMl20GaMcnQd9fzKN7ea3HkKmMX6U8Kv+XFM58SFUfVr/SotvSnM7BYsIupiAoMjMSSbAAKg3JqJ2x53vEoaWuGTgQ0j7+YytkV8OOgA3XEEHSlVRWy6+8bBh79/jWB8FKOaH6/yq2cQ5tiHvJNgMIbHSZIyWZTys7xSkqb9GqEwWKxZYKiSOSCQojLEgGxI2uQDtetGOTbETbiOQDiQ13iOz9geapSR4FzqDeaehI8CKqI7Jvw/Q1uYfJcTJ6kLn9wgfM2FT75jmESl3w8qqObNFIAPeTsK+DiHHWVzC+g7ghGAYeTr08wa+/5/azvkwzBzMwI8G0PgV5GFwg+aRx/2EedUwPA8ps2IkSFPC4Zj7t9P1Puq+cPcOJELQxlQR3pZB32HuNjb4AeRqm5d6QhC1/sURb8RlfV83DNVgw3pQUqXfByhAQGZGDAX5XJCgE+ZrNxWzdqYz/WOq36GUa3vvV3LeJurcGIwUJrFnxNz+yvmEwaRCyjnzJ5n3mtqqXg/SVgH9ZpY/zxk/8ABqrdxvG+BjhMoxCSW5IhBcnw08x7zsKDBSx0YIyOFrdyn/zEbqu3h4rf4lzyLBQNNJv0Vb7u3QD+Z6C5qG4JyaUF8dih/iZ97H/w02soHQ2AuOgAHO99bIclnxc64/Hrp0/93w55IOYZgfa6773sTawAvVSvIiYY2mpPzEf0jvzOuls/LQXu33CgGQ9T6DTrkpSlVVOlKUoiUpSiJSlKIlKUoi18XikiRpJGCIouzMbADzrn+e+lGNbrhYzIfxyXVPgvrN8bVb+LodeCxK/+jIR7wpYfUVwrKHgDFpwzBQGRVAs5DKdL+Cstxq6XvY8q1dn4WKVrnvBNNAqGMxD43Na00rqtvMc+xmNYI8skmo2WJNlJ6AIvP43NauAyaeZQ6pZCbCRyFUm9rKT65v7KAnyqc4ajw0rShESOWzNEZXWRgdV1WGJwscjBRY62vcgi1rVK51xJEjvZW1ktIhkvIyF0eOSE/eK2HYEabxkjSFNup1HTuY74cTPfd5jKhqKXVAQhzfiSP9991H/3OWLUJ3dmVGa0elEuFLWMkl2UFVYhjHY6GsSRUfn6DB4mIwxiNo445LMxk75Grdjs9jyZBp5dQaxYrieUtG0apDoVBZRcNoWSNNRe7G0blbFiDueZrDhMoxs6IiQzyIt9A0voW9r6S3dAPlXtjZGnemcKagmnXl7ryXxzmEbsTb8h7PvVXVs3jhkZUnRGEyMUUCJex7dZQdSqFeTsm0lQRqUm4JXfHJxHEI2YYhJGiTRGGEnat3IyS73sxeWELdARpKkkXNVqXgfMUXUcM1v2WjJ+Qa9ROJyvER+vBMn5o3H6ioGYTDu+WSp5Ee+nDmvbsTM3NlPFTWa55DLh5Io+0XvxlRIbs33uKke+nu2UyqB1Nr+7Y4TzmKKMKZOydZVZyZJbSIodlCAHSHD2UiwupHPeqlpPgfka2sPlc8nqQTP+WNz+gq07DxhhaTQE196eKrtxDy/eAralv2XQs2zRkVu0WRwkJIkkVTG+mMKghZwwkYyS6y9hcItwbGvgkgihmcBXgAn06WjTWDEiNqEJ0HWzwgB01La9r1XMZw9mk6oZMM7BAQndiUqNu6ACCFFtlttc+JqJxeBxkKFJIp44zzDK4U7g77aeYB+A8KpR4WNwDQ8V1ofLUHorj8Q8EndNOfryWbKsmWeGSTtShjkRLGN2Xvg6SzJdlGpSt9JFyvjWDMsjnh1FkDKjFWeNldVINiHKk6Dfo1jXvIs9bDn1EkQPrCsAdMgVgjqejKSD52+Is2B4iw6ogWXsQWjuERtaapFM+pipBQ2Yq6tr3AINqtyPnY8kCo98Mr8a2NudaNkL2AE0PviqvlvEWLw9uxxEij8OrUv8LXX6VdMn9Kbiy4mEMPxx7H4oxsfgRUTny4UwiZ0j7ZpCA2HIEbtqZ2WxXS0caNGhcC7Mx52N4DOcTh5CrwxGJm1mRQe4CXJURjnYLseQvyAqMxQ4j5o++3mPxysV735IMn9y7zkucQ4qMSwvqW5B2IIItcMDuCL1JVVPRnhOzy+I2sZC8h+LG3+0CrXXNzsayVzW5AlbUTi5gccyEpSlRKRKUpREpSlEXhmAFybAc6qGcekTBQEqrNMw6Ri6/FzZflerJmeXxYiNopUDo1rqb/y3BrlfG/AqYSM4iKcdmCB2cnrXPIRsB3j5EXsCbm1XcFFh5H7spNdBoe+/kOqrYl8rG1jA98lYOHONmzDENhmiSON4pLd4s17DmbAWsT0rkgUiwPPlbz5VOcEY0Q47DyMQF16STyGpWTfyuwq6ZwMRhJXEGHwuCjLNbFSOrM97nu3u9z+AKbe7etgbmFlLGNs4Ai9MiQc6k6ZAnks2jsTGHOOROlc6U4AfZVLKuB8dPa0PZqfal7g/hI1H+GrplPorhWxxEzSH8KDQvuJ3Y/C1T3BGNSSDSuM+1OjntHKurDVcgaW3A6A8rDblVorOxW0cRvFgNKcAR53CuQYOHdDqV638rKJyvh3CYa3Y4eNSPa03b+I3b61LUpWY5xcauNVeADRQJSlK+L6lKUovtSlKUoviisw4fwk9+1w8Tk+0UGr+Id761V8y9F2Ee5heSE9BfWvybvf7qvtKmixEsXyOI71E+GN/zNC4tnPAGMSyI6YgIp0or2ZVLE3CMdgWvyJub1UMXhpImKSIyPb1XUqfka/QGb5tBhPvcRKEV9KqNJJuNRPqgkix9wt51VMP9sxM10mweNwzSAsrqPuhfeyG7qdtrk7+FbGG2hLu1kApxyrxoabvdbks6bBRk0aTXx8daeKZ7xc2WNBhViSRUw6au8VN91FjYjkt9x1qQyb0jYKYhXLQMf8AUHd/jGwH5rVzbj7FiXMMQwNwrBB+4oU/7gal+B+BUxkYnkmHZ6iOzj9a46OSLL0NgDcEbivj8Hhm4dr5bGguOJvll5dUbiZnTlkdwOPAc12GOQEAgggi4I6+6slaGVZZDh4xFCgRBcgC/XmSTuTW/WGaVstUVpdKUpXxfUpSlESuXcc4DGZhiuxhibsoABqbuoXYAsbnmQCFsL2sfGuo0qfDzmF++BU6V0UU0Qlbuk2XIsP6KcSf8zEQr+VXf9dNTOE9FkNwZsTLIR+EKvw31G3uNdEpU7tpYl36qdAAoW4GBv6VFZLkeHwiFIIwgJuxuSWP7TEkn+VStKVSc4uNXGpVoAAUCUpSvi+pSlKIlKUoiUpSiJSlKIo3OsmgxcfZTJqW9xuQVPipG4O9VGT0XQg6ocTPG3Q3U2+ICm3xroFKnixM0QoxxA4aKJ8MbzVwuuTYn0Tyj/LxMbfnRl+oLVl4My7GZdi1jnjtDP3C6nUmsXKG43BJuu4F9VdUr4asO2jM9hZJRwPKnfXkVCMFGxwcyxC+0pSqCtpSlKIlKUoiUpSiJSlKIlKUoiUpSiJSlKIlKUoiUpSiJSlKIlKUoiUpSiJSlKIlKUoi/9k="
					class="logo_img" style="width: 80px; height: 50px" />
			</div>
			<div>
				<img
					src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRNtiML_ZRiUjLiFSzpmDKf6ssIG-dhHgND5rKzavWJ_oi48XhvVP9E-fJ8UnC1vqm7a-c&usqp=CAU"
					style="width: 150px; height: 50px" />
			</div>
		</div>
	</header>
	<div>
		<div class="section_containerop"
			style="display: flex; justify-content: space-evenly; align-items: center; padding: 5Px;">

			<div class="section_wrapper_right"
<<<<<<< HEAD
				style="height: 100%; margin: 16px; padding: 10px 30px; display: flex; justify-content: space-between; flex-direction: column; box-shadow: 0 15px 15px rgb(0 0 0/ 0.2); border-radius: 8px;">
				<div style="margin-top: 2px"></div>

				<center>

					<div class="containerio" id="11thMath">
						<img id="image" src="Images/Marksheet.jpg" alt="Snow"> <a
=======
				style="padding: 10px 30px; display: flex; justify-content: space-between; flex-direction: column; box-shadow: 0 15px 15px rgb(0 0 0/ 0.2); border-radius: 8px;">
				
				<center>

					<div class="containerio" id="11thMath">
						<img style="height: 10%; width: 50%;" id="image" src="Images/MarksheetUp1.jpg" alt="Snow"> <a
>>>>>>> vishvajeet_Jadoun
							id="downloadLink" download="Marked_Marksheet.jpg" href="#"
							style="display: block;">Download Marksheet</a>
						<div class="text studentName" id="studentName"></div>
						<br>
						<div class="text fatherName" style="" id="fatherName"></div>
						<div class="text motherName" id="motherName"></div>
						<div class="text scholarNo" id="scholarNo"></div>
						<div class="text studentRollNo" id="studentRollNo"></div>
						<div class="text physics" id="physics"></div>
						<div class="text chemistry" id="chemistry"></div>
						<div class="text biology" id="biology"></div>
						<div class="text mathematic" id="mathematic"></div>
						<div class="text english" id="english"></div>
						<div class="text hindi" id="hindi"></div>
						<div class="text dateOfBirth" id="dateOfBirth"></div>

						<div class="text totalMarks" id="totalMarks"></div>

					</div>


					<div class="containerio" id="9th" style="display: none">
						<img id="image" src="Images/Marksheet.jpg" alt="Snow"> <a
							id="downloadLink" download="Marked_Marksheet.jpg" href="#"
							style="display: block; text-decoration: none;">Download Marksheet</a>
						<div class="text top-left" id="studentName"></div>
					</div>
<<<<<<< HEAD

					
					<div></div>
					<div></div>
				</center>
			</div>
		</div>
	</div>
	<!-- <footer class="footer">
        <div class="container4">
            <p>&copy; 2024 Vishvajeet Rajput. All rights reserved.</p>
        </div>
    </footer> -->
=======
					
</center>

					
			</div>
		</div>
	</div>
	<footer class="footer">
        <div class="container4">
            <p>&copy; 2024 Vishvajeet Rajput. All rights reserved.</p>
        </div>
    </footer>
>>>>>>> vishvajeet_Jadoun
</body>

<style>
.containerio {
	position: relative;
	width: 100%;
}

.text {
	position: absolute;
	/* Text color */
<<<<<<< HEAD
	font-size: 13px; /* Adjust font size as needed */
=======
	font-size: 11px; /* Adjust font size as needed */
		color: rgb(0, 112, 192);
		font-weight: bold;
	
	
>>>>>>> vishvajeet_Jadoun
}

.bottom-left {
	bottom: 0;
	left: 0;
}

.studentName {
	top: 235px;
	left: 162px;
<<<<<<< HEAD
	font-weight: bold;
	color: RGB(44, 51, 96);
=======
>>>>>>> vishvajeet_Jadoun
}

.fatherName {
	top: 282px;
	left: 419px;
<<<<<<< HEAD
	font-weight: bold;
	color: RGB(44, 51, 96);
=======
>>>>>>> vishvajeet_Jadoun
}

.motherName {
	top: 276px;
	left: 111px;
<<<<<<< HEAD
	font-weight: bold;
	color: RGB(44, 51, 96);
=======
>>>>>>> vishvajeet_Jadoun
}
.dateOfBirth{
    top: 320px;
    left: 223px;
<<<<<<< HEAD

	font-weight: bold;
	color: RGB(44, 51, 96);
=======
>>>>>>> vishvajeet_Jadoun
}


.scholarNo {
	top: 189px;
	
	left: 290px;
<<<<<<< HEAD
	font-weight: bold;
	color: RGB(44, 51, 96);
=======
>>>>>>> vishvajeet_Jadoun
}

.studentRollNo {
	top: 192px;
	left: 494px;
<<<<<<< HEAD
	font-weight: bold;
	color: RGB(44, 51, 96);
}

.physics {
	top: 552px; left : 435px;
	font-weight: bold;
	color: RGB(44, 51, 96);
	left: 435px;
}

.chemistry {
	top: 591px; left : 434px;
	font-weight: bold;
	color: RGB(44, 51, 96);
=======
}

.physics {
	left: 435px;
} 

.chemistry {
	top: 591px; left : 434px;
>>>>>>> vishvajeet_Jadoun
	left: 434px;
}

.biology {
	top: 626px;
    left: 437px;
<<<<<<< HEAD
	font-weight: bold;
	color: RGB(44, 51, 96);
=======
>>>>>>> vishvajeet_Jadoun
}

.mathematic {
	    top: 664px;
    left: 434px;
<<<<<<< HEAD
		font-weight: bold;
	color: RGB(44, 51, 96);
=======
>>>>>>> vishvajeet_Jadoun
}

.totalMarks {
	     top: 691px;
    left: 434px;
<<<<<<< HEAD
		font-weight: bold;
	color: RGB(44, 51, 96);
=======
>>>>>>> vishvajeet_Jadoun
}

.english {
	top: 516px;
	left: 435px;
<<<<<<< HEAD
	font-weight: bold;
	color: RGB(44, 51, 96);
=======
>>>>>>> vishvajeet_Jadoun
}

.hindi {
	top: 480px;
	left: 435px;
<<<<<<< HEAD
	font-weight: bold;
	color: RGB(44, 51, 96);
=======
>>>>>>> vishvajeet_Jadoun
}

.top-right {
	top: 0;
	right: 0;
}

.bottom-right {
	bottom: 0;
	right: 0;
}
<<<<<<< HEAD

=======
 
>>>>>>> vishvajeet_Jadoun
.centered {
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
}
<<<<<<< HEAD
</style>

<script th:inline="javascript">
=======

</style>

<script th:inline="javascript">
 
let studentRollNo=[[${studentRollNo}]];
>>>>>>> vishvajeet_Jadoun
let name=[[${studentName}]];
let fatherName=[[${fatherName}]];
let motherName=[[${motherName}]];
let scholarNo=[[${scholarNo}]];
<<<<<<< HEAD
let studentRollNo=[[${studentRollNo}]];
=======

>>>>>>> vishvajeet_Jadoun
let physics=[[${physics}]];
let chemistry=[[${chemistry}]];
let biology=[[${biology}]];
let mathematic=[[${mathematic}]];
let english=[[${english}]];
let hindi=[[${hindi}]];
let totalMarks=[[${totalMarks}]];
let dateOfBirth=[[${dateOfbirth}]];


document.getElementById("studentName").innerHTML=name;
document.getElementById("fatherName").innerHTML=fatherName;
document.getElementById("motherName").innerHTML=motherName;
document.getElementById("scholarNo").innerHTML=scholarNo;
document.getElementById("studentRollNo").innerHTML=studentRollNo;
document.getElementById("physics").innerHTML=physics;
document.getElementById("chemistry").innerHTML=chemistry;
document.getElementById("biology").innerHTML=biology;
document.getElementById("mathematic").innerHTML=mathematic;
document.getElementById("english").innerHTML=english;
document.getElementById("hindi").innerHTML=hindi;
document.getElementById("totalMarks").innerHTML=totalMarks;
document.getElementById("dateOfBirth").innerHTML=dateOfBirth;
<<<<<<< HEAD

	
	   document.getElementById("downloadLink").addEventListener("click", function() {
	      
		   var image = document.getElementById("image");
	       
		   var canvas = document.createElement("canvas");
	       
	        var context = canvas.getContext("2d");

	        // Set canvas dimensions to match image dimensions
	        canvas.width = image.width;
	        canvas.height = image.height;

	        // Draw the image on the canvas
	        context.drawImage(image, 0, 0);

	        // Draw text on the canvas
	         context.font = "20px Arial"; // Adjust font size and style as needed
	         /* context.fillStyle = "blac k"; */// Adjust text color as needed
	        context.fillText(name, 200, 250); // Adjust text position as needed
	        context.fillText(fatherName, 295, 280);
	        // Convert canvas to data URL and set as download link href
	        var downloadLink = document.getElementById("downloadLink");
	        downloadLink.href = canvas.toDataURL("image/jpeg");

	        // Simulate click to trigger download
	        downloadLink.click();
	    });
	
</script>
</html>
=======
	
document.getElementById("downloadLink").addEventListener("click", function() {
    var image = document.getElementById("image");

    var canvas = document.createElement("canvas");
    var context = canvas.getContext("2d");

    // Ensure the image is fully loaded before drawing it
    if (image.complete) {
        drawCanvas();
    } else {
        image.onload = drawCanvas;
    }

    function drawCanvas() {
        // Set canvas dimensions to match the natural image dimensions
        canvas.width = image.naturalWidth;
        canvas.height = image.naturalHeight;

        // Draw the image on the canvas
        context.drawImage(image, 0, 0, canvas.width, canvas.height);

        // Draw text on the canvas
        context.font = "40px Arial"; // Adjust font size and style as needed
        context.fillStyle = "rgb(0, 112, 192)"; // Using an RGB color value
        context.fillText(dateOfBirth, 645, 1540);
        context.fillText(dateOfBirth, 770, 1650);

        context.fillText(studentRollNo, 1950, 930);
        context.fillText(name, 600, 1220); 
        context.fillText(fatherName, 450, 1420);
        context.fillText(motherName, 720, 1320);
        context.fillText(scholarNo, 820, 930);
        context.fillText(hindi, 1370, 2280);
        context.fillText(english, 1370, 2360);        
        context.fillText(physics, 1370, 2440);
        context.fillText(chemistry, 1370, 2520);
        context.fillText(biology, 1370, 2600);
        context.fillText(mathematic, 1370, 2680);
      /*   
        context.fillText(totalMarks, 1370, 2520);
         */
        var downloadLink = document.getElementById("downloadLink");
        downloadLink.href = canvas.toDataURL("image/jpeg");

        downloadLink.click();
    }
});

</script>

</html>
>>>>>>> vishvajeet_Jadoun
